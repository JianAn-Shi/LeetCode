package solver.test62;

import solver.ISolver;

public class Test62Solver2 implements ISolver {
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
        if(m <= 0 || n <= 0){
            return 0;
        }
        int arr[][] = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i == 0 || j == 0){
                    arr[i][j] = 1;
                }else{
                    arr[i][j] = arr[i-1][j]+arr[i][j-1];
                }
            }
        }
        return arr[m-1][n-1];
    }

    @Override
    public String getName() {
        return "动态规划";
    }
}

