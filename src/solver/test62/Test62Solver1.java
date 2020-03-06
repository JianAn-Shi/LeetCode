package solver.test62;

import solver.ISolver;

public class Test62Solver1 implements ISolver {
    @Override
    public Object solve(Object... args) {
        if (args == null || args.length != 2) {
            return null;
        }
        int m = (int) args[0];
        int n = (int) args[1];
        return uniquePaths(m, n, null);
    }

    public int uniquePaths(int m, int n, int[][] arr) {
        if (arr == null) {
            arr = new int[m][n];
        }
        if (m <= 0 || n <= 0) {
            return 0;
        }
        if (arr[m - 1][n - 1] > 0) {
            return arr[m - 1][n - 1];
        }
        if (m == 1 || n == 1) {
            arr[m - 1][n - 1] = 1;
            return arr[m - 1][n - 1];
        }
        arr[m - 1][n - 1] = uniquePaths(m - 1, n, arr) + uniquePaths(m, n - 1, arr);
        return arr[m - 1][n - 1];
    }

    @Override
    public String getName() {
        return "备忘录and递归";
    }
}

