import solver.ISolver;
import solver.test62.Test62Solver;
import solver.test62.Test62Solver1;
import solver.test62.Test62Solver2;
import solver.test64.Test64Solver;
import solver.test64.Test64Solver1;

public class Test {

    public static void main(String[] args) {
        ISolver solver = new Test64Solver1();
        solver.solve();
        Solution solution = new Solution(ProblemLoader.findProblem(64), solver);
        int [][] arr = {{1,3,1},{1,5,1},{4,2,1}};
        solution.solve(arr);
    }

}
