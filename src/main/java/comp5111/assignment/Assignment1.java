package comp5111.assignment;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Arrays;

public class Assignment1 {

    // The inner classes of Subject
    private static final String[] CUT_CLASSES = {
            "comp5111.assignment.cut.Subject",
            "comp5111.assignment.cut.Subject$StringAlgorithms",
            "comp5111.assignment.cut.Subject$DateTimeAlgorithms",
            "comp5111.assignment.cut.Subject$GamePlayer",
            "comp5111.assignment.cut.Subject$GamePlace",
            "comp5111.assignment.cut.Subject$GameConfiguration"
    };

    public static void main(String[] args) throws Exception {

        /* check the arguments */
        if (args.length < 1) {
            System.err.println("Usage: java comp5111.assignment.Assignment1 <test-class-name> [<source-classpath>]");
            System.err.println("Example: java comp5111.assignment.Assignment1 comp5111.assignment.cut.Regression_6_Test target/classes");
            System.exit(1);
        }

        String testClassName = args[0];
        String sourceClassPath = args.length > 1 ? args[1] : "target/classes";
        String instrumentedDir = "sootOutput";
        String reportFile = "line-coverage-report.txt";

        System.out.println("=== COMP5111 Assignment 1 - Soot Line Coverage Tool ===");
        System.out.println("Test class: " + testClassName);
        System.out.println("Source classpath: " + sourceClassPath);
        System.out.println();

        // Step 1: Instrument the CUT using Soot
        System.out.println("[Step 1] Instrumenting classes with Soot...");
        CoverageTracker.clearAll();
        LineCoverageInstrumenter instrumenter = new LineCoverageInstrumenter(sourceClassPath, instrumentedDir);
        instrumenter.instrument(CUT_CLASSES);
        System.out.println();

        // Step 2: Run tests using a separate process so instrumented classes are used
        System.out.println("[Step 2] Running tests on instrumented classes...");
        System.out.println("Instrumentation complete. Now run TestRunner separately.");
        System.out.println();
        System.out.println("To run tests and generate the report, execute:");
        System.out.println("  java -cp sootOutput:target/classes:target/test-classes:lib/* comp5111.assignment.TestRunner " + testClassName);
    }
}
