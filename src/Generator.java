import java.util.Random;

public class Generator {

    public static int[][] createArray(int rowCount, int columnCount, int... value) {
        int[][] arr = new int[rowCount][columnCount];
        if (value == null || value.length == 0) {
            return arr;
        } else {
            Random random = new Random();
            int size = value.length;
            for (int i = 0; i < rowCount; i++) {
                for (int j = 0; j < columnCount; j++) {
                    if (size == 1) {
                        arr[i][j] = value[0];
                    } else {
                        arr[i][j] = value[random.nextInt(size )];
                    }
                }
            }
            return arr;
        }
    }

}
