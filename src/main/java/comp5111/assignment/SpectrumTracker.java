package comp5111.assignment;

import java.io.*;
import java.util.*;

// Spectrum tracker. Holds the global stmt registry, the per-test
// bitset of covered stmt ids, and pass/fail per test.
public class SpectrumTracker {

    public static class StmtInfo {
        public final int id;
        public final String className;
        public final String methodSig;
        public final int sourceLine;
        public final String jimple;
        public StmtInfo(int id, String c, String m, int l, String j) {
            this.id = id; this.className = c; this.methodSig = m;
            this.sourceLine = l; this.jimple = j;
        }
    }

    private static final List<StmtInfo> stmts = new ArrayList<>();

    private static String currentTest = null;
    private static BitSet currentCov = new BitSet();
    private static final Map<String, BitSet> perTestCov = new LinkedHashMap<>();
    private static final Map<String, Boolean> perTestPass = new LinkedHashMap<>();

    public static synchronized int registerStmt(String cls, String msig, int line, String jimple) {
        int id = stmts.size();
        stmts.add(new StmtInfo(id, cls, msig, line, jimple));
        return id;
    }

    public static synchronized void cover(int id) {
        if (currentTest != null) currentCov.set(id);
    }

    public static synchronized void startTest(String name) {
        currentTest = name;
        currentCov = new BitSet();
    }

    public static synchronized void endTest(boolean passed) {
        if (currentTest == null) return;
        perTestCov.put(currentTest, (BitSet) currentCov.clone());
        perTestPass.put(currentTest, passed);
        currentTest = null;
        currentCov = new BitSet();
    }

    public static int numStmts() { return stmts.size(); }
    public static List<StmtInfo> stmts() { return stmts; }
    public static Map<String, BitSet> perTestCov() { return perTestCov; }
    public static Map<String, Boolean> perTestPass() { return perTestPass; }

    public static synchronized void clearAll() {
        stmts.clear();
        perTestCov.clear();
        perTestPass.clear();
        currentTest = null;
        currentCov = new BitSet();
    }

    // Instrumentation and testing run in different JVMs, so I persist
    // the stmt registry after instrumentation and load it before tests.

    public static void saveMetadata() throws IOException {
        saveMetadata("spectrum-metadata.dat");
    }

    public static void saveMetadata(String file) throws IOException {
        try (PrintWriter pw = new PrintWriter(new FileWriter(file))) {
            for (StmtInfo s : stmts) {
                pw.println(s.id + "\t" + s.className + "\t" + s.methodSig + "\t" +
                           s.sourceLine + "\t" + s.jimple.replace("\t", "    ").replace("\n", " "));
            }
        }
    }

    public static void loadMetadata() throws IOException {
        loadMetadata("spectrum-metadata.dat");
    }

    public static void loadMetadata(String file) throws IOException {
        stmts.clear();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] p = line.split("\t", 5);
                if (p.length < 5) continue;
                stmts.add(new StmtInfo(
                    Integer.parseInt(p[0]), p[1], p[2],
                    Integer.parseInt(p[3]), p[4]));
            }
        }
    }

    // Per-test coverage bitsets + pass/fail; OchiaiAnalyzer reads these.
    public static void savePerTest(String file) throws IOException {
        try (PrintWriter pw = new PrintWriter(new FileWriter(file))) {
            for (Map.Entry<String, BitSet> e : perTestCov.entrySet()) {
                String name = e.getKey();
                BitSet bs = e.getValue();
                Boolean pass = perTestPass.get(name);
                StringBuilder sb = new StringBuilder();
                sb.append(name).append("\t").append(pass == null ? "?" : (pass ? "P" : "F")).append("\t");
                boolean first = true;
                for (int i = bs.nextSetBit(0); i >= 0; i = bs.nextSetBit(i + 1)) {
                    if (!first) sb.append(",");
                    sb.append(i);
                    first = false;
                }
                pw.println(sb.toString());
            }
        }
    }

    public static void loadPerTest(String file) throws IOException {
        perTestCov.clear();
        perTestPass.clear();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] p = line.split("\t", 3);
                if (p.length < 2) continue;
                String name = p[0];
                boolean pass = "P".equals(p[1]);
                BitSet bs = new BitSet();
                if (p.length == 3 && !p[2].isEmpty()) {
                    for (String s : p[2].split(",")) bs.set(Integer.parseInt(s));
                }
                perTestCov.put(name, bs);
                perTestPass.put(name, pass);
            }
        }
    }
}
