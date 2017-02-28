/**
 * Created by Ioana on 2/25/2017.
 */
public class Multiply {
    public static void main(String[] args) {
        int x = SkeletonJava.readIntConsole("x");
        int y = SkeletonJava.readIntConsole("y");
        int multi = multi(x, y);
        System.out.println(x + " * " + y + " = " + multi);

    }
    //test

    private static int multi(int x, int y) {
        int max, min, multi;
        if (x > y) {
            max = x;
            min = y;
        }else{
            max = y;
            min = x;
        }
      multi = max;
        for(int counter = 1;counter<min;counter++){
            multi += max;
        }
        return multi;
    }
}
