import java.util.Arrays;

public class Printer {

    public static void print(Object... args) {
        if (args != null) {
            for (Object object : args) {
                if (object != null) {
                    if (object.getClass().isArray()) {

                    } else {

                    }
                }
            }
        }
    }

}
