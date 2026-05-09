package comp5111.assignment;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

// 跑测试然后生成覆盖率报告
// 注意：要把sootOutput放在classpath最前面，这样才能加载到插桩后的class
public class TestRunner {

    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            System.err.println("Usage: java comp5111.assignment.TestRunner <test-class-name>");
            System.exit(1);
        }
        String testCls = args[0];

        // 先加载之前保存的元数据
        CoverageTracker.loadMetadata();

        System.out.println("Running tests: " + testCls);
        Class<?> tc = Class.forName(testCls);
        JUnitCore junit = new JUnitCore();
        Result res = junit.run(tc);

        System.out.println("Tests run: " + res.getRunCount());
        System.out.println("Tests failed: " + res.getFailureCount());
        System.out.println("Tests ignored: " + res.getIgnoreCount());
        if (res.getFailureCount() > 0) {
            for (Failure f : res.getFailures()) {
                System.out.println("  - " + f.getTestHeader() + ": " + f.getMessage());
            }
        }
        System.out.println();

        System.out.println("Generating line coverage report...");
        CoverageTracker.generateReport("line-coverage-report.txt", testCls);
        System.out.println("Done!");
    }
}