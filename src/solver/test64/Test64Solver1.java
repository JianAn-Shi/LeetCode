package solver.test64;

import solver.ISolver;

public class Test64Solver1 implements ISolver {
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
        int[][] result = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (i == 0 && j == 0) {
                    result[i][j] = grid[i][j];
                } else if (i == 0) {
                    int rowCount = 0;
                    for (int k = 0; k <= j; k++) {
                        rowCount += grid[i][k];
                    }
                    result[i][j] = rowCount;
                } else if (j == 0) {
                    int columnCount = 0;
                    for (int k = 0; k <= i; k++) {
                        columnCount += grid[k][j];
                    }
                    result[i][j] = columnCount;
                } else {
                    int left = result[i][j - 1] + grid[i][j];
                    int top = result[i - 1][j] + grid[i][j];
                    result[i][j] = Math.min(left, top);
                }
            }
        }
        return result[row - 1][column - 1];
    }

    @Override
    public String getName() {
        return "动态规划";
    }
}
