/**
 * @author flo
 * @since 25/02/2017.
 */
public class Example {
    public static void main(String[] thisIsAnArgument) {
        System.out.println("Good bye!");


        int x = SkeletonJava.readIntConsole("x=");
        int y = SkeletonJava.readIntConsole("y=");
        int suma = Sum(x, y);
        SkeletonJava.printConsole(x + "+" + y + "=" + suma);
    }

    public static int Sum(int x, int y) {
        int max, min;
        if (x > y) {
            max = x;
            min = y;
        } else {
            max = y;
            min = x;
        }

        int sum = max;
        //int counter = y;

        //while (counter > 0) {
        for (int counter = 0; counter < min; counter++) {
            sum = sum + 1;
            SkeletonJava.printConsole("Adding 1 to sum");
            // counter = counter - 1;
        }


        return sum;
    }
}




