/**
 * Created by Ioana on 2/25/2017.
 */
public class Substract {
    public static void main(String[] args) {
        int x = SkeletonJava.readIntConsole("x=");
        int y = SkeletonJava.readIntConsole("y=");
        int subs = subs(x, y);
        System.out.println(x + "-" + y + "=" + subs);
    }

    private static int subs(int x, int y) {
        int max, min;
        if (x > y) {
            max = x;
            min = y;
        } else {
            min = x;
            max = y;
        }
        int dif = max;
        for (int counter = 0; counter < min; counter++) {
            dif = dif - 1;
        }
        return dif;
    }

}
