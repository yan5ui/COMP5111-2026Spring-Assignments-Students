package comp5111.assignment;

import soot.*;
import soot.jimple.*;
import soot.jimple.internal.JIdentityStmt;
import soot.options.Options;
import soot.tagkit.LineNumberTag;
import soot.tagkit.Tag;

import java.io.File;
import java.util.*;

// Stmt-level (Jimple) instrumenter. Every non-identity Jimple stmt
// gets a global id; I insert SpectrumTracker.cover(id) before it.
public class StatementInstrumenter {

    private final String cp;
    private final String outDir;

    public StatementInstrumenter(String cp, String outDir) {
        this.cp = cp;
        this.outDir = outDir;
    }

    public void instrument(String[] classNames) {
        G.reset();

        Options.v().set_prepend_classpath(true);
        Options.v().set_allow_phantom_refs(true);
        Options.v().set_soot_classpath(Scene.v().defaultClassPath() + File.pathSeparator + cp);
        Options.v().set_output_dir(outDir);
        Options.v().set_output_format(Options.output_format_class);
        Options.v().set_keep_line_number(true);
        Options.v().set_whole_program(false);

        for (String cn : classNames) {
            SootClass sc = Scene.v().forceResolve(cn, SootClass.BODIES);
            sc.setApplicationClass();
        }
        Scene.v().forceResolve("comp5111.assignment.SpectrumTracker", SootClass.SIGNATURES);
        Scene.v().loadNecessaryClasses();

        SootClass tracker = Scene.v().getSootClass("comp5111.assignment.SpectrumTracker");
        SootMethod coverMtd = tracker.getMethodByName("cover");

        SpectrumTracker.clearAll();

        for (String cn : classNames) {
            SootClass sc = Scene.v().getSootClass(cn);
            for (SootMethod m : sc.getMethods()) {
                if (!m.isConcrete()) continue;
                Body body = m.retrieveActiveBody();
                PatchingChain<Unit> units = body.getUnits();

                String msig = methodSig(m);
                // Snapshot toString() BEFORE inserting any probe, otherwise
                // a goto/if target text shows the probe instead of the
                // original next stmt.
                List<Unit> targets = new ArrayList<>();
                List<String> texts = new ArrayList<>();
                List<Integer> lines = new ArrayList<>();
                for (Unit u : units) {
                    if (u instanceof JIdentityStmt) continue;
                    targets.add(u);
                    texts.add(u.toString());
                    lines.add(getLine(u));
                }

                for (int k = 0; k < targets.size(); k++) {
                    Unit u = targets.get(k);
                    int sid = SpectrumTracker.registerStmt(cn, msig, lines.get(k), texts.get(k));
                    InvokeExpr inv = Jimple.v().newStaticInvokeExpr(
                        coverMtd.makeRef(), IntConstant.v(sid));
                    Stmt probe = Jimple.v().newInvokeStmt(inv);
                    units.insertBefore(probe, u);
                }
                body.validate();
            }
        }

        PackManager.v().writeOutput();

        try {
            SpectrumTracker.saveMetadata();
        } catch (Exception e) {
            System.err.println("Failed to save metadata: " + e.getMessage());
        }
        System.out.println("Instrumentation complete. " +
            SpectrumTracker.numStmts() + " statements registered. Output: " + outDir);
    }

    private static String methodSig(SootMethod m) {
        StringBuilder sb = new StringBuilder();
        sb.append("<").append(m.getDeclaringClass().getName()).append(": ");
        sb.append(m.getReturnType()).append(" ").append(m.getName()).append("(");
        List<String> ps = new ArrayList<>();
        for (Type t : m.getParameterTypes()) ps.add(t.toString());
        sb.append(String.join(",", ps)).append(")>");
        return sb.toString();
    }

    private static int getLine(Unit u) {
        for (Tag t : u.getTags()) {
            if (t instanceof LineNumberTag)
                return ((LineNumberTag) t).getLineNumber();
        }
        return -1;
    }
}
