/**
 * Created by Ioana on 2/26/2017.
 */
public class TemaPb1Lab3 {
    //    Read max. Build the array of even numbers from 0 to 2*max.
    public static void main(String[] args) {
        buildArrayofEvenNo();
    }

    public static void buildArrayofEvenNo() {
        int max = SkeletonJava.readIntConsole("How many numbers? ");
        int maxEven = max * 2;
        System.out.println("The array is: ");
        for (int i = 0; i < maxEven; i++) {
            System.out.println(i + " ");
        }
        System.out.println("The array of even numbers from 0 to 2*max is: ");
        int even[] = new int[maxEven];
        for (int j = 0; j < maxEven; j++) {
            if (isEven(j)) {
                System.out.print(j + " ");
            }
        }
    }

    public static boolean isEven(int no) {
        if (no % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

}
