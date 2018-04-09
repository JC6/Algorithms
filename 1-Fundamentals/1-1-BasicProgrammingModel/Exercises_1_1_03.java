/**
 * Created by Jiang Chen on 2018/4/9.
 */
public class Exercises_1_1_03 {

    public static void main(String[] args) {
        if (args.length > 2) {
            int i0 = Integer.parseInt(args[0]);
            int i1 = Integer.parseInt(args[1]);
            int i2 = Integer.parseInt(args[2]);
            if (i0 == i1)
                i2 = 0;
            else
                i0 = 1;
            if (i0 == i1 && i0 == i2) {
                System.out.println("equal");
                return;
            }
        }
        System.out.println("not equal");
    }
}
