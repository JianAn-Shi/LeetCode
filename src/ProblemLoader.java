import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class ProblemLoader {

    public static final List<Problem> PROBLEMS = new ArrayList<>();

    static {
        Properties properties = new Properties();
        try {
            FileInputStream in = new FileInputStream("src/resources/problem-leetcode.properties");
            properties.load(in);
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Set<Object> keySet = properties.keySet();
        for (Object key : keySet) {
            Object value = properties.get(key);
            if (value != null) {
                Problem problem = new Problem(key.toString(), value.toString());
                PROBLEMS.add(problem);
            }
        }
    }

    public static Problem findProblem(int index) {
        for (Problem problem : PROBLEMS) {
            if (problem.getIndex().equals(index + "")) {
                return problem;
            }
        }
        return null;
    }

    public static void printAllProblems() {
        for (Problem problem : PROBLEMS) {
            System.out.println(problem);
        }
    }

}
