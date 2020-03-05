import solver.ISolver;
import solver.Test63Solver1;

public class Test {

    public static void main(String[] args) {
        ISolver solver = new Test63Solver1();
        solver.solve();
        Solution solution = new Solution(ProblemLoader.findProblem(63), solver);
        int[][] arr = Generator.createArray(20,15, 0,1);
        solution.solve(arr);
    }

}
