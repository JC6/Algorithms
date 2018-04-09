/**
 * Created by Jiang Chen on 2018/4/9.
 */
public class Exercises_1_1_09 {

    public static void main(String[] args) {
        for (int i = 1; i <= 1024; i++) {
            assert integerToBinaryString(i).equals(Integer.toBinaryString(i));
        }
    }

    private static String integerToBinaryString(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.insert(0, n % 2);
            n /= 2;
        }
        return sb.toString();
    }
}
