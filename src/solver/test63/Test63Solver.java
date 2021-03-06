package solver.test63;

import solver.ISolver;

public class Test63Solver implements ISolver {

    @Override
    public Object solve(Object... args) {
        if (args == null || args.length == 0) {
            return null;
        }
        int[][] obstacleGrid = (int[][]) args;
        return uniquePathsWithObstacles(obstacleGrid);
    }

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid == null || obstacleGrid.length == 0) {
            return -1;
        }
        int rowCount = obstacleGrid.length;
        int columnCount = obstacleGrid[0].length;
        int[][] result = new int[rowCount][columnCount];
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < columnCount; j++) {
                result[i][j] = uniquePathsWithObstacles(i, j, obstacleGrid);
            }
        }
        return result[rowCount - 1][columnCount - 1];
    }

    public int uniquePathsWithObstacles(int i, int j, int[][] obstacleGrid) {
        if (obstacleGrid[i][j] == 1) {
            return 0;
        } else if (i == 0 && j == 0) {
            return 1;
        } else if (i == 0 && j > 0) {
            return uniquePathsWithObstacles(i, j - 1, obstacleGrid);
        } else if (i > 0 && j == 0) {
            return uniquePathsWithObstacles(i - 1, j, obstacleGrid);
        } else {
            return uniquePathsWithObstacles(i, j - 1, obstacleGrid) + uniquePathsWithObstacles(i - 1, j, obstacleGrid);
        }
    }

    @Override
    public String getName() {
        return "递归";
    }
}
