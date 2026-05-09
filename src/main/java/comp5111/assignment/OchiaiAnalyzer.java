package comp5111.assignment;

import java.io.*;
import java.util.*;

// Reads spectrum-metadata.dat + spectrum-pertest.dat, computes Ochiai
// per stmt, ranks per FAQ Q5, writes a tsv.
public class OchiaiAnalyzer {

    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            System.err.println("Usage: java comp5111.assignment.OchiaiAnalyzer " +
                "<output-tsv> [pertest-file] [metadata-file]");
            System.exit(1);
        }
        String outTsv = args[0];
        String pertest = args.length > 1 ? args[1] : "spectrum-pertest.dat";
        String meta = args.length > 2 ? args[2] : "spectrum-metadata.dat";

        SpectrumTracker.loadMetadata(meta);
        SpectrumTracker.loadPerTest(pertest);

        List<SpectrumTracker.StmtInfo> stmts = SpectrumTracker.stmts();
        Map<String, BitSet> cov = SpectrumTracker.perTestCov();
        Map<String, Boolean> pass = SpectrumTracker.perTestPass();

        int totalFail = 0, totalPass = 0;
        List<BitSet> failBs = new ArrayList<>();
        List<BitSet> passBs = new ArrayList<>();
        for (Map.Entry<String, Boolean> e : pass.entrySet()) {
            BitSet bs = cov.get(e.getKey());
            if (bs == null) continue;
            if (e.getValue()) { totalPass++; passBs.add(bs); }
            else { totalFail++; failBs.add(bs); }
        }
        System.out.println("Tests: " + (totalFail + totalPass) +
            " (failed: " + totalFail + ", passed: " + totalPass + ")");

        if (totalFail == 0) {
            System.err.println("WARNING: No failing tests; Ochiai score will be 0 for all stmts.");
        }

        // aef = #failing tests covering stmt; aep = #passing tests covering it.
        double[] scores = new double[stmts.size()];
        int[] aef = new int[stmts.size()];
        int[] aep = new int[stmts.size()];
        for (int i = 0; i < stmts.size(); i++) {
            int sid = stmts.get(i).id;
            int ef = 0, ep = 0;
            for (BitSet bs : failBs) if (bs.get(sid)) ef++;
            for (BitSet bs : passBs) if (bs.get(sid)) ep++;
            aef[i] = ef; aep[i] = ep;
            double denom = Math.sqrt((double) totalFail * (ef + ep));
            scores[i] = denom == 0.0 ? 0.0 : ef / denom;
        }

        // Sort by score desc, then methodSig asc, then jimple asc.
        Integer[] idx = new Integer[stmts.size()];
        for (int i = 0; i < idx.length; i++) idx[i] = i;
        final double[] sc = scores;
        Arrays.sort(idx, (a, b) -> {
            int c = Double.compare(sc[b], sc[a]);
            if (c != 0) return c;
            SpectrumTracker.StmtInfo sa = stmts.get(a);
            SpectrumTracker.StmtInfo sb = stmts.get(b);
            c = sa.methodSig.compareTo(sb.methodSig);
            if (c != 0) return c;
            return sa.jimple.compareTo(sb.jimple);
        });

        // FAQ Q5: rank(a) = floor((N + M + 1) / 2), N = #stmts with
        // score > a, M = #stmts with score >= a (including a). Done by
        // counting per unique score level, then summing.
        TreeMap<Double, Integer> countByScore = new TreeMap<>(Comparator.reverseOrder());
        for (double s : scores) countByScore.merge(s, 1, Integer::sum);
        Map<Double, Integer> nGreater = new HashMap<>();
        Map<Double, Integer> mGreaterEq = new HashMap<>();
        int running = 0;
        for (Map.Entry<Double, Integer> e : countByScore.entrySet()) {
            nGreater.put(e.getKey(), running);
            running += e.getValue();
            mGreaterEq.put(e.getKey(), running);
        }
        int[] rank = new int[stmts.size()];
        for (int i = 0; i < stmts.size(); i++) {
            int N = nGreater.get(scores[i]);
            int M = mGreaterEq.get(scores[i]);
            rank[i] = (N + M + 1) / 2; // floor by integer div
        }

        try (PrintWriter pw = new PrintWriter(new FileWriter(outTsv))) {
            for (int i : idx) {
                SpectrumTracker.StmtInfo s = stmts.get(i);
                pw.println(s.methodSig + "\t" + s.jimple + "\t" +
                           String.format(Locale.US, "%.6f", scores[i]) + "\t" + rank[i]);
            }
        }
        System.out.println("Ochiai spectrum tsv written: " + outTsv);

        // Also print top-30 to console
        System.out.println("--- Top 30 suspicious statements ---");
        int shown = 0;
        for (int i : idx) {
            if (shown++ >= 30) break;
            SpectrumTracker.StmtInfo s = stmts.get(i);
            System.out.printf("rank=%d  score=%.4f  aef=%d/%d  aep=%d/%d  line=%d  %s :: %s%n",
                rank[i], scores[i], aef[i], totalFail, aep[i], totalPass,
                s.sourceLine, s.methodSig, s.jimple);
        }
    }
}
