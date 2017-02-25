/**
 * Created by Ioana on 2/25/2017.
 */
public class MaxFromRead {
    public static void main(String[] args) {
        int n = SkeletonJava.readIntConsole("How many numbers? ");

        int max = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            int read = SkeletonJava.readIntConsole("Give me a number");
            if (read > max) {
                max = read;
            }
            SkeletonJava.printConsole(max);
        }

    }
}
