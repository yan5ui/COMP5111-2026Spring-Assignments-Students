package comp5111.assignment;

import java.io.IOException;
import java.util.Arrays;

public class Assignment1 {

    // 需要插桩的类，包含Subject和所有inner class
    static String[] CUT_CLASSES = {
        "comp5111.assignment.cut.Subject",
        "comp5111.assignment.cut.Subject$StringAlgorithms",
        "comp5111.assignment.cut.Subject$DateTimeAlgorithms",
        "comp5111.assignment.cut.Subject$GamePlayer",
        "comp5111.assignment.cut.Subject$GamePlace",
        "comp5111.assignment.cut.Subject$GameConfiguration"
    };

    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            System.err.println("Usage: java comp5111.assignment.Assignment1 <test-class-name> [<source-classpath>]");
            System.exit(1);
        }

        String testCls = args[0];
        String srcCp = args.length > 1 ? args[1] : "target/classes";
        String outDir = "sootOutput";

        System.out.println("=== COMP5111 Assignment 1 - Soot Line Coverage Tool ===");
        System.out.println("Test class: " + testCls);
        System.out.println("Source classpath: " + srcCp);
        System.out.println();

        // 第一步：用soot做插桩
        System.out.println("[Step 1] Instrumenting classes with Soot...");
        CoverageTracker.clearAll();
        LineCoverageInstrumenter inst = new LineCoverageInstrumenter(srcCp, outDir);
        inst.instrument(CUT_CLASSES);
        System.out.println();

        // 插桩完了要用另一个jvm跑测试，不然classloader会有问题
        System.out.println("[Step 2] Running tests on instrumented classes...");
        System.out.println("Instrumentation complete. Now run TestRunner separately.");
        System.out.println();
        System.out.println("To run tests and generate the report, execute:");
        System.out.println("  java -cp sootOutput:target/classes:target/test-classes:lib/* comp5111.assignment.TestRunner " + testCls);
    }
}