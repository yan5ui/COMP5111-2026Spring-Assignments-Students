package comp5111.assignment;

import soot.*;
import soot.jimple.*;
import soot.jimple.internal.JIdentityStmt;
import soot.options.Options;
import soot.tagkit.LineNumberTag;
import soot.tagkit.Tag;

import java.io.File;
import java.util.*;

/**
 * Uses Soot to instrument the Subject class (and inner classes) to track line coverage.
 * Inserts calls to CoverageTracker.cover(className, lineNumber) after each non-identity statement.
 */
public class LineCoverageInstrumenter {

    private final String classPath;
    private final String outputDir;

    public LineCoverageInstrumenter(String classPath, String outputDir) {
        this.classPath = classPath;
        this.outputDir = outputDir;
    }

    public void instrument(String[] classNames) {
        // Reset Soot
        G.reset();

        // Set Soot options
        Options.v().set_prepend_classpath(true);
        Options.v().set_allow_phantom_refs(true);
        Options.v().set_soot_classpath(
                Scene.v().defaultClassPath()
                        + File.pathSeparator + classPath
        );
        Options.v().set_output_dir(outputDir);
        Options.v().set_output_format(Options.output_format_class);
        Options.v().set_keep_line_number(true);
        Options.v().set_whole_program(false);

        // Load classes
        for (String className : classNames) {
            SootClass sc = Scene.v().forceResolve(className, SootClass.BODIES);
            sc.setApplicationClass();
        }

        // Load CoverageTracker
        Scene.v().forceResolve("comp5111.assignment.CoverageTracker", SootClass.SIGNATURES);
        Scene.v().loadNecessaryClasses();

        // Get the CoverageTracker.cover method and registerLine method
        SootClass trackerClass = Scene.v().getSootClass("comp5111.assignment.CoverageTracker");
        SootMethod coverMethod = trackerClass.getMethodByName("cover");
        SootMethod registerLineMethod = trackerClass.getMethodByName("registerLine");

        // Instrument each class
        for (String className : classNames) {
            SootClass sootClass = Scene.v().getSootClass(className);
            for (SootMethod method : sootClass.getMethods()) {
                if (!method.isConcrete()) continue;

                Body body = method.retrieveActiveBody();
                PatchingChain<Unit> units = body.getUnits();

                // Collect all non-identity stmts with their line numbers
                List<Unit> toInstrument = new ArrayList<>();
                Map<Unit, Integer> unitLineMap = new LinkedHashMap<>();

                for (Unit unit : units) {
                    if (unit instanceof JIdentityStmt) continue;
                    int lineNum = getLineNumber(unit);
                    if (lineNum < 0) continue;
                    toInstrument.add(unit);
                    unitLineMap.put(unit, lineNum);
                }

                // Build method signature string (like TA report format)
                String methodSig = method.getReturnType() + " " + method.getName() + "("
                        + String.join(",", method.getParameterTypes().stream()
                        .map(Object::toString).toArray(String[]::new)) + ")";

                // Register all lines and insert coverage probes
                Set<Integer> registeredLines = new HashSet<>();
                for (Unit unit : toInstrument) {
                    int lineNum = unitLineMap.get(unit);
                    String stmtStr = unit.toString();
                    CoverageTracker.registerLine(className, lineNum, stmtStr, methodSig);

                    // Insert: CoverageTracker.cover(className, lineNum)
                    // Only insert one probe per unique line number per method to avoid overhead
                    // Actually, we insert for each stmt but the tracker uses a Set
                    InvokeExpr invokeExpr = Jimple.v().newStaticInvokeExpr(
                            coverMethod.makeRef(),
                            StringConstant.v(className),
                            IntConstant.v(lineNum)
                    );
                    Stmt coverStmt = Jimple.v().newInvokeStmt(invokeExpr);
                    units.insertBefore(coverStmt, unit);
                }

                body.validate();
            }
        }

        // Write out instrumented classes
        PackManager.v().writeOutput();

        // Save metadata for use in the test runner process
        try {
            CoverageTracker.saveMetadata();
        } catch (Exception e) {
            System.err.println("Warning: Failed to save metadata: " + e.getMessage());
        }

        System.out.println("Instrumentation complete. Output written to: " + outputDir);
    }

    private int getLineNumber(Unit unit) {
        for (Tag tag : unit.getTags()) {
            if (tag instanceof LineNumberTag) {
                return ((LineNumberTag) tag).getLineNumber();
            }
        }
        return -1;
    }
}
