/**
 * Created by Jiang Chen on 2018/4/9.
 */
public class Exercises_1_1_11 {

    public static void main(String[] args) {
        boolean[][] booleans = {
                {true, true, true},
                {false, false, false},
                {true, false, true}};
        printBooleanArray(booleans);
    }

    private static void printBooleanArray(boolean[][] booleanArray) {
        int rows = booleanArray.length;
        int columns = booleanArray[0].length;
        for (int i = 0; i < columns; i++) {
            System.out.printf("\t%d", i + 1);
        }
        for (int i = 0; i < rows; i++) {
            System.out.printf("\n%d", i + 1);
            for (int j = 0; j < columns; j++) {
                if (booleanArray[i][j]) {
                    System.out.print("\t*");
                } else {
                    System.out.print("\t");
                }
            }
        }
    }
}
