import solver.ISolver;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {

    private final Problem problem;
    private final Set<ISolver> solutionList;

    public Solution(Problem problem, ISolver solver) {
        this.problem = problem;
        solutionList = new HashSet<>();
        solutionList.add(solver);
    }

    public Solution(Problem problem, Set<ISolver> solutionList) {
        this.problem = problem;
        this.solutionList = solutionList;
    }

    public void solve(Object... args) {
        int solutionCount = solutionList == null ? 0 : solutionList.size();
        if (solutionCount > 0) {
            System.out.println("开始解决问题：" + problem);
            System.out.println(Arrays.toString(args));
            int index = 1;
            for (ISolver solver : solutionList) {
                System.out.println("解法" + index + ":" + solver.getName());
                long preStamp = System.currentTimeMillis();
                Object result = solver.solve(args);
                long afterStamp = System.currentTimeMillis();
                System.out.println("解法" + index + "耗费时间" + (afterStamp - preStamp) + "ms，执行结果：" + result);
            }
        }
    }
}
