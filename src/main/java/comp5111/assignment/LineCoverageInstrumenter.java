package comp5111.assignment;

import soot.*;
import soot.jimple.*;
import soot.jimple.internal.JIdentityStmt;
import soot.options.Options;
import soot.tagkit.LineNumberTag;
import soot.tagkit.Tag;
import java.io.File;
import java.util.*;

public class LineCoverageInstrumenter {

    private String cp;  // classpath
    private String outDir;

    public LineCoverageInstrumenter(String cp, String outDir) {
        this.cp = cp;
        this.outDir = outDir;
    }

    // 用soot对CUT做插桩，每个非identitystmt前面插入CoverageTracker.cover()
    public void instrument(String[] classNames) {
        G.reset();

        // soot的一些设置
        Options.v().set_prepend_classpath(true);
        Options.v().set_allow_phantom_refs(true);
        Options.v().set_soot_classpath(Scene.v().defaultClassPath() + File.pathSeparator + cp);
        Options.v().set_output_dir(outDir);
        Options.v().set_output_format(Options.output_format_class);
        Options.v().set_keep_line_number(true);  // 保留行号，参考FAQ Q9
        Options.v().set_whole_program(false);

        // 加载要分析的class
        for (String cn : classNames) {
            SootClass sc = Scene.v().forceResolve(cn, SootClass.BODIES);
            sc.setApplicationClass();
        }
        Scene.v().forceResolve("comp5111.assignment.CoverageTracker", SootClass.SIGNATURES);
        Scene.v().loadNecessaryClasses();

        SootClass trackerCls = Scene.v().getSootClass("comp5111.assignment.CoverageTracker");
        SootMethod coverMtd = trackerCls.getMethodByName("cover");

        for (String cn : classNames) {
            SootClass sc = Scene.v().getSootClass(cn);
            for (SootMethod m : sc.getMethods()) {
                if (!m.isConcrete()) continue;
                Body body = m.retrieveActiveBody();
                PatchingChain<Unit> units = body.getUnits();

                // 先收集需要插桩的unit，跳过JIdentityStmt（参考FAQ Q3）
                List<Unit> targets = new ArrayList<>();
                Map<Unit, Integer> lineMap = new LinkedHashMap<>();
                for (Unit u : units) {
                    if (u instanceof JIdentityStmt) continue;
                    int ln = getLineNum(u);
                    if (ln < 0) continue;
                    targets.add(u);
                    lineMap.put(u, ln);
                }

                // 构造方法签名字符串，用于报告里显示
                String msig = m.getReturnType() + " " + m.getName() + "("
                    + String.join(",", m.getParameterTypes().stream()
                        .map(Object::toString).toArray(String[]::new)) + ")";

                for (Unit u : targets) {
                    int ln = lineMap.get(u);
                    // 把行信息注册到tracker里面
                    CoverageTracker.registerLine(cn, ln, u.toString(), msig);

                    // 在每个statment前插入cover调用
                    InvokeExpr inv = Jimple.v().newStaticInvokeExpr(
                        coverMtd.makeRef(),
                        StringConstant.v(cn),
                        IntConstant.v(ln));
                    Stmt s = Jimple.v().newInvokeStmt(inv);
                    units.insertBefore(s, u);
                }
                body.validate();
            }
        }

        PackManager.v().writeOutput();

        // 保存元数据到文件
        try {
            CoverageTracker.saveMetadata();
        } catch (Exception e) {
            System.err.println("保存metadata失败: " + e.getMessage());
        }
        System.out.println("Instrumentation complete. Output written to: " + outDir);
    }

    // 获取一个unit的源代码行号
    private int getLineNum(Unit u) {
        for (Tag t : u.getTags()) {
            if (t instanceof LineNumberTag)
                return ((LineNumberTag) t).getLineNumber();
        }
        return -1;
    }
}