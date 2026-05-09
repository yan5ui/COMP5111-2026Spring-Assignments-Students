package comp5111.assignment;

// Phase 1 of my FL pipeline. Loads the CUT through Soot, inserts
// SpectrumTracker.cover(id) before every non-identity Jimple stmt,
// writes instrumented classes to sootOutput/ and the stmt registry to
// spectrum-metadata.dat. Tests + Ochiai run in separate JVMs.
public class Assignment2 {

    static final String[] CUT_CLASSES = {
        "comp5111.assignment.cut.Subject",
        "comp5111.assignment.cut.Subject$StringAlgorithms",
        "comp5111.assignment.cut.Subject$DateTimeAlgorithms",
        "comp5111.assignment.cut.Subject$GamePlayer",
        "comp5111.assignment.cut.Subject$GamePlace",
        "comp5111.assignment.cut.Subject$GameConfiguration"
    };

    public static void main(String[] args) throws Exception {
        String srcCp = args.length > 0 ? args[0] : "target/classes";
        String outDir = args.length > 1 ? args[1] : "sootOutput";

        System.out.println("=== COMP5111 A2 - Statement-level Soot Instrumenter ===");
        System.out.println("Source classpath: " + srcCp);
        System.out.println("Output dir:       " + outDir);

        StatementInstrumenter inst = new StatementInstrumenter(srcCp, outDir);
        inst.instrument(CUT_CLASSES);

        System.out.println();
        System.out.println("Next: run tests on instrumented classes, e.g.");
        System.out.println("  java -cp \"sootOutput:target/classes:target/test-classes:lib/*\" \\");
        System.out.println("       comp5111.assignment.SpectrumRunner <test-class> spectrum-pertest.dat");
        System.out.println("Then compute Ochiai:");
        System.out.println("  java -cp \"target/classes:lib/*\" \\");
        System.out.println("       comp5111.assignment.OchiaiAnalyzer <output.tsv> spectrum-pertest.dat");
    }
}
