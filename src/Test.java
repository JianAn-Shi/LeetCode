import solver.ISolver;
import solver.test62.Test62Solver;
import solver.test62.Test62Solver1;
import solver.test62.Test62Solver2;

public class Test {

    public static void main(String[] args) {
        ISolver solver = new Test62Solver2();
        solver.solve();
        Solution solution = new Solution(ProblemLoader.findProblem(62), solver);
        solution.solve(20,20);
    }

}
