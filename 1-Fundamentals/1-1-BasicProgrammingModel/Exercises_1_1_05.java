/**
 * Created by Jiang Chen on 2018/4/9.
 */
public class Exercises_1_1_05 {

    public static void main(String[] args) {
        assert betweenZeroAndOne(0.1, 0.1);
        assert !betweenZeroAndOne(0.1, 1);
        assert !betweenZeroAndOne(1, 0.1);
        assert !betweenZeroAndOne(1, 1);
        assert !betweenZeroAndOne(Math.E, Math.PI);
    }

    private static boolean betweenZeroAndOne(double x, double y) {
        return x > 0 && x < 1 && y > 0 && y < 1;
    }
}
