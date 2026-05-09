package comp5111.assignment;

import org.junit.runner.Description;
import org.junit.runner.JUnitCore;
import org.junit.runner.Request;
import org.junit.runner.Result;
import org.junit.runner.Runner;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

// Run each @Test method on its own so SpectrumTracker can record
// per-test pass/fail + per-test coverage. Output: spectrum-pertest.dat
public class SpectrumRunner {

    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            System.err.println("Usage: java comp5111.assignment.SpectrumRunner " +
                "<test-class[,test-class,...]> [output-pertest-file]");
            System.exit(1);
        }
        String[] testClasses = args[0].split(",");
        String outFile = args.length > 1 ? args[1] : "spectrum-pertest.dat";

        SpectrumTracker.loadMetadata();

        int totalRun = 0, totalFail = 0;
        for (String cn : testClasses) {
            cn = cn.trim();
            if (cn.isEmpty()) continue;
            System.out.println("=== Running test class: " + cn + " ===");
            Class<?> tc = Class.forName(cn);
            List<Method> methods = collectTestMethods(tc);
            System.out.println("  Test methods discovered: " + methods.size());

            for (Method tm : methods) {
                String testName = cn + "#" + tm.getName();
                SpectrumTracker.startTest(testName);

                final boolean[] failed = {false};
                JUnitCore junit = new JUnitCore();
                junit.addListener(new RunListener() {
                    @Override public void testFailure(Failure failure) { failed[0] = true; }
                });

                Request req = Request.method(tc, tm.getName());
                Runner runner = req.getRunner();
                Result res;
                try {
                    res = junit.run(runner);
                } catch (Throwable t) {
                    failed[0] = true;
                    res = null;
                }

                SpectrumTracker.endTest(!failed[0]);
                totalRun++;
                if (failed[0]) totalFail++;
            }
        }
        System.out.println();
        System.out.println("Total tests run: " + totalRun + ", failed: " + totalFail);

        SpectrumTracker.savePerTest(outFile);
        System.out.println("Per-test spectrum saved to: " + outFile);
    }

    private static List<Method> collectTestMethods(Class<?> tc) {
        List<Method> out = new ArrayList<>();
        for (Method m : tc.getMethods()) {
            if (m.isAnnotationPresent(org.junit.Test.class)) out.add(m);
        }
        out.sort((a, b) -> a.getName().compareTo(b.getName()));
        return out;
    }
}
