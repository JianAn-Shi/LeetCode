package solver.test64;

import solver.ISolver;

public class Test64Solver implements ISolver {
    @Override
    public Object solve(Object... args) {
        if (args == null || args.length == 0) {
            return null;
        }
        int[][] obstacleGrid = (int[][]) args;
        return minPathSum(obstacleGrid);
    }

    public int minPathSum(int[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int row = grid.length;
        int column = grid[0].length;
        return sum(grid, row-1, column-1);
    }

    private int sum(int[][] grid, int m, int n) {
        int row = grid.length;
        int column = grid[0].length;
        if (m == 0 && n == 0) {
            return grid[0][0];
        } else if (m == 0) {
            int result = 0;
            for (int j = 0; j < column; j++) {
                result += grid[0][j];
            }
            return result;
        } else if (n == 0) {
            int result = 0;
            for (int j = 0; j < row; j++) {
                result += grid[j][0];
            }
            return result;
        } else {
            int top = sum(grid, m - 1, n) + grid[m][n];
            int left = sum(grid, m, n - 1) + grid[m][n];
            return Math.min(top, left);
        }
    }

    @Override
    public String getName() {
        return "递归";
    }
}
