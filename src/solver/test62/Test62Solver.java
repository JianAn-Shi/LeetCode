package solver.test62;

import solver.ISolver;

public class Test62Solver implements ISolver {
    @Override
    public Object solve(Object... args) {
        if (args == null || args.length != 2) {
            return null;
        }
        int m = (int) args[0];
        int n = (int) args[1];
        return uniquePaths(m,n);
    }

    public int uniquePaths(int m, int n) {
        if(m<=0||n<=0){
            return 0;
        }
        if(m==1||n==1){
            return 1;
        }
        return uniquePaths(m-1,n)+uniquePaths(m,n-1);
    }

    @Override
    public String getName() {
        return "递归";
    }
}
