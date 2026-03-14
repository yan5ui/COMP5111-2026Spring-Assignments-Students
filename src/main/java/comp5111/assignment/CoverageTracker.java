package comp5111.assignment;

import java.io.*;
import java.util.*;

/**
 * Runtime coverage tracker. Instrumented code calls CoverageTracker.cover(classname, lineNumber)
 * to record which lines have been executed.
 */
public class CoverageTracker {

    // Map: className -> Set of covered line numbers
    private static final Map<String, Set<Integer>> coveredLines = new LinkedHashMap<>();

    // Map: className -> Map(lineNumber -> list of jimple statements)
    private static final Map<String, Map<Integer, List<String>>> lineStmtMap = new LinkedHashMap<>();

    // Map: className -> Set of all instrumentable line numbers
    private static final Map<String, Set<Integer>> allLines = new LinkedHashMap<>();

    // Map: className -> Map(lineNumber -> methodSignature)
    private static final Map<String, Map<Integer, String>> lineMethodMap = new LinkedHashMap<>();

    public static synchronized void cover(String className, int lineNumber) {
        coveredLines.computeIfAbsent(className, k -> new TreeSet<>()).add(lineNumber);
    }

    public static synchronized void registerLine(String className, int lineNumber, String stmtStr, String methodSig) {
        allLines.computeIfAbsent(className, k -> new TreeSet<>()).add(lineNumber);
        lineStmtMap.computeIfAbsent(className, k -> new TreeMap<>())
                .computeIfAbsent(lineNumber, k -> new ArrayList<>()).add(stmtStr);
        lineMethodMap.computeIfAbsent(className, k -> new TreeMap<>()).putIfAbsent(lineNumber, methodSig);
    }

    public static void clearAll() {
        coveredLines.clear();
        lineStmtMap.clear();
        allLines.clear();
        lineMethodMap.clear();
    }

    private static final String METADATA_FILE = "coverage-metadata.dat";

    /**
     * Save line metadata to a file so it can be loaded in another JVM.
     */
    public static void saveMetadata() throws IOException {
        try (PrintWriter pw = new PrintWriter(new FileWriter(METADATA_FILE))) {
            for (String className : allLines.keySet()) {
                Map<Integer, List<String>> stmtMap = lineStmtMap.getOrDefault(className, Collections.emptyMap());
                Map<Integer, String> methodMap = lineMethodMap.getOrDefault(className, Collections.emptyMap());
                for (int lineNum : allLines.get(className)) {
                    String method = methodMap.getOrDefault(lineNum, "");
                    List<String> stmts = stmtMap.getOrDefault(lineNum, Collections.emptyList());
                    for (String stmt : stmts) {
                        // Format: className\tlineNum\tmethod\tstmt
                        pw.println(className + "\t" + lineNum + "\t" + method + "\t" + stmt);
                    }
                    if (stmts.isEmpty()) {
                        pw.println(className + "\t" + lineNum + "\t" + method + "\t");
                    }
                }
            }
        }
    }

    /**
     * Load line metadata from file.
     */
    public static void loadMetadata() throws IOException {
        allLines.clear();
        lineStmtMap.clear();
        lineMethodMap.clear();
        try (BufferedReader br = new BufferedReader(new FileReader(METADATA_FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\t", 4);
                if (parts.length < 2) continue;
                String className = parts[0];
                int lineNum = Integer.parseInt(parts[1]);
                String method = parts.length > 2 ? parts[2] : "";
                String stmt = parts.length > 3 ? parts[3] : "";
                allLines.computeIfAbsent(className, k -> new TreeSet<>()).add(lineNum);
                if (!method.isEmpty()) {
                    lineMethodMap.computeIfAbsent(className, k -> new TreeMap<>()).putIfAbsent(lineNum, method);
                }
                if (!stmt.isEmpty()) {
                    lineStmtMap.computeIfAbsent(className, k -> new TreeMap<>())
                            .computeIfAbsent(lineNum, k -> new ArrayList<>()).add(stmt);
                }
            }
        }
    }

    /**
     * Generate a line coverage report and write it to the given file.
     */
    public static void generateReport(String outputFile, String testSuiteName) throws IOException {
        try (PrintWriter pw = new PrintWriter(new FileWriter(outputFile))) {
            pw.println(testSuiteName + " - Line Coverage");
            pw.println();
            pw.println("Overview:");
            pw.println("********************************************************************************************");

            int totalAllLines = 0;
            int totalCoveredLines = 0;

            List<String> classNames = new ArrayList<>(allLines.keySet());
            Collections.sort(classNames);

            Map<String, int[]> classStats = new LinkedHashMap<>();
            for (String className : classNames) {
                Set<Integer> all = allLines.getOrDefault(className, Collections.emptySet());
                Set<Integer> covered = coveredLines.getOrDefault(className, Collections.emptySet());
                int total = all.size();
                int cov = 0;
                for (int line : covered) {
                    if (all.contains(line)) cov++;
                }
                classStats.put(className, new int[]{total, cov});
                totalAllLines += total;
                totalCoveredLines += cov;
            }

            double overallPct = totalAllLines == 0 ? 0 : (totalCoveredLines * 100.0 / totalAllLines);
            pw.printf("Overall: %n");
            pw.printf("total: %d   covered: %d   percentage: %.1f%%%n", totalAllLines, totalCoveredLines, overallPct);
            pw.println();

            for (String className : classNames) {
                int[] stats = classStats.get(className);
                double pct = stats[0] == 0 ? 0 : (stats[1] * 100.0 / stats[0]);
                pw.printf("%s%n", className);
                pw.printf("total: %d   covered: %d    percentage: %.1f%%%n", stats[0], stats[1], pct);
                pw.println();
            }

            pw.println("Details:");
            pw.println("********************************************************************************************");
            pw.println();

            for (String className : classNames) {
                pw.println(className);
                pw.println();

                Set<Integer> all = allLines.getOrDefault(className, Collections.emptySet());
                Set<Integer> covered = coveredLines.getOrDefault(className, Collections.emptySet());
                Map<Integer, List<String>> stmtMap = lineStmtMap.getOrDefault(className, Collections.emptyMap());
                Map<Integer, String> methodMap = lineMethodMap.getOrDefault(className, Collections.emptyMap());

                String currentMethod = null;
                for (int line : new TreeSet<>(all)) {
                    // Print method header when method changes
                    String method = methodMap.get(line);
                    if (method != null && !method.equals(currentMethod)) {
                        currentMethod = method;
                        pw.println(method);
                    }

                    List<String> stmts = stmtMap.getOrDefault(line, Collections.emptyList());
                    String stmtInfo = String.join("; ", stmts);
                    boolean isCovered = covered.contains(line);
                    String status = isCovered ? "Covered" : "Missing";
                    pw.printf("%s Line %d   (you are encouraged to further print relevant Jimple statements in this line: %s )%n",
                            status, line, stmtInfo);
                }
                pw.println();
            }
        }
        System.out.println("Line coverage report written to: " + outputFile);
    }
}
