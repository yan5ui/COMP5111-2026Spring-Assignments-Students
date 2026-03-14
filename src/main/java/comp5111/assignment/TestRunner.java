package comp5111.assignment;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Runs JUnit tests and generates line coverage report.
 * Must be run with instrumented classes on the classpath (before original classes).
 */
public class TestRunner {

    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            System.err.println("Usage: java comp5111.assignment.TestRunner <test-class-name>");
            System.exit(1);
        }

        String testClassName = args[0];
        String reportFile = "line-coverage-report.txt";

        // Load metadata from instrumentation step
        CoverageTracker.loadMetadata();

        System.out.println("Running tests: " + testClassName);

        // Load and run the test class
        Class<?> testClass = Class.forName(testClassName);
        JUnitCore junit = new JUnitCore();
        Result result = junit.run(testClass);

        System.out.println("Tests run: " + result.getRunCount());
        System.out.println("Tests failed: " + result.getFailureCount());
        System.out.println("Tests ignored: " + result.getIgnoreCount());
        if (result.getFailureCount() > 0) {
            System.out.println("Failures:");
            for (Failure failure : result.getFailures()) {
                System.out.println("  - " + failure.getTestHeader() + ": " + failure.getMessage());
            }
        }
        System.out.println();

        // Generate report
        System.out.println("Generating line coverage report...");
        CoverageTracker.generateReport(reportFile, testClassName);
        System.out.println("Done!");
    }
}
