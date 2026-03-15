package comp5111.assignment;

import java.io.*;
import java.util.*;

// 用来记录覆盖率的类，插桩后的代码会调用cover方法
public class CoverageTracker {

    static Map<String, Set<Integer>> coveredLines = new LinkedHashMap<>();
    static Map<String, Map<Integer, List<String>>> lineStmtMap = new LinkedHashMap<>();
    static Map<String, Set<Integer>> allLines = new LinkedHashMap<>();
    // 记录每一行属于哪个method
    static Map<String, Map<Integer, String>> lineMethodMap = new LinkedHashMap<>();

    // 运行时被插桩代码调用
    public static synchronized void cover(String cls, int line) {
        coveredLines.computeIfAbsent(cls, k -> new TreeSet<>()).add(line);
    }

    // instrumnetation的时候注册每一行的信息
    public static synchronized void registerLine(String cls, int line, String stmt, String msig) {
        allLines.computeIfAbsent(cls, k -> new TreeSet<>()).add(line);
        lineStmtMap.computeIfAbsent(cls, k -> new TreeMap<>())
            .computeIfAbsent(line, k -> new ArrayList<>()).add(stmt);
        lineMethodMap.computeIfAbsent(cls, k -> new TreeMap<>()).putIfAbsent(line, msig);
    }

    public static void clearAll() {
        coveredLines.clear();
        lineStmtMap.clear();
        allLines.clear();
        lineMethodMap.clear();
    }

    // 把元数据存到文件里，因为instrumnet和跑测试是两个jvm进程
    public static void saveMetadata() throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter("coverage-metadata.dat"));
        for (String cls : allLines.keySet()) {
            Map<Integer, List<String>> sm = lineStmtMap.getOrDefault(cls, Collections.emptyMap());
            Map<Integer, String> mm = lineMethodMap.getOrDefault(cls, Collections.emptyMap());
            for (int ln : allLines.get(cls)) {
                String m = mm.getOrDefault(ln, "");
                List<String> stmts = sm.getOrDefault(ln, Collections.emptyList());
                if (stmts.isEmpty()) {
                    pw.println(cls + "\t" + ln + "\t" + m + "\t");
                } else {
                    for (String s : stmts) {
                        pw.println(cls + "\t" + ln + "\t" + m + "\t" + s);
                    }
                }
            }
        }
        pw.close();
    }

    // 从文件加载元数据
    public static void loadMetadata() throws IOException {
        allLines.clear();
        lineStmtMap.clear();
        lineMethodMap.clear();
        BufferedReader br = new BufferedReader(new FileReader("coverage-metadata.dat"));
        String line;
        while ((line = br.readLine()) != null) {
            String[] p = line.split("\t", 4);
            if (p.length < 2) continue;
            String cls = p[0];
            int ln = Integer.parseInt(p[1]);
            String meth = p.length > 2 ? p[2] : "";
            String stmt = p.length > 3 ? p[3] : "";
            allLines.computeIfAbsent(cls, k -> new TreeSet<>()).add(ln);
            if (!meth.isEmpty())
                lineMethodMap.computeIfAbsent(cls, k -> new TreeMap<>()).putIfAbsent(ln, meth);
            if (!stmt.isEmpty())
                lineStmtMap.computeIfAbsent(cls, k -> new TreeMap<>())
                    .computeIfAbsent(ln, k -> new ArrayList<>()).add(stmt);
        }
        br.close();
    }

    // 生成覆盖率报告
    public static void generateReport(String outFile, String testName) throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter(outFile));
        pw.println(testName + " - Line Coverage");
        pw.println();
        pw.println("Overview:");
        pw.println("********************************************************************************************");

        int totAll = 0, totCov = 0;

        List<String> clsNames = new ArrayList<>(allLines.keySet());
        Collections.sort(clsNames);

        // 先统计每个class的覆盖情况
        Map<String, int[]> stats = new LinkedHashMap<>();
        for (String cls : clsNames) {
            Set<Integer> all = allLines.getOrDefault(cls, Collections.emptySet());
            Set<Integer> cov = coveredLines.getOrDefault(cls, Collections.emptySet());
            int t = all.size();
            int c = 0;
            for (int l : cov) {
                if (all.contains(l)) c++;
            }
            stats.put(cls, new int[]{t, c});
            totAll += t;
            totCov += c;
        }

        double pct = totAll == 0 ? 0 : (totCov * 100.0 / totAll);
        pw.printf("Overall: %n");
        pw.printf("total: %d   covered: %d   percentage: %.1f%%%n", totAll, totCov, pct);
        pw.println();

        for (String cls : clsNames) {
            int[] s = stats.get(cls);
            double p = s[0] == 0 ? 0 : (s[1] * 100.0 / s[0]);
            pw.println(cls);
            pw.printf("total: %d   covered: %d    percentage: %.1f%%%n", s[0], s[1], p);
            pw.println();
        }

        pw.println("Details:");
        pw.println("********************************************************************************************");
        pw.println();

        // 输出每个class每行的详细覆盖信息
        for (String cls : clsNames) {
            pw.println(cls);
            pw.println();
            Set<Integer> all = allLines.getOrDefault(cls, Collections.emptySet());
            Set<Integer> cov = coveredLines.getOrDefault(cls, Collections.emptySet());
            Map<Integer, List<String>> sm = lineStmtMap.getOrDefault(cls, Collections.emptyMap());
            Map<Integer, String> mm = lineMethodMap.getOrDefault(cls, Collections.emptyMap());

            String curMethod = null;
            for (int l : new TreeSet<>(all)) {
                String meth = mm.get(l);
                if (meth != null && !meth.equals(curMethod)) {
                    curMethod = meth;
                    pw.println(meth);
                }
                List<String> stmts = sm.getOrDefault(l, Collections.emptyList());
                String info = String.join("; ", stmts);
                String status = cov.contains(l) ? "Covered" : "Missing";
                pw.printf("%s Line %d   (you are encouraged to further print relevant Jimple statements in this line: %s )%n",
                    status, l, info);
            }
            pw.println();
        }
        pw.close();
        System.out.println("Line coverage report written to: " + outFile);
    }
}