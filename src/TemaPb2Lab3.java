/**
 * Created by Ioana on 2/26/2017.
 */
public class TemaPb2Lab3 {
    //Given an array of numbers, separate elements by parity
    public static void main(String[] args) {
        int n = SkeletonJava.readIntConsole("How many numbers? ");
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = SkeletonJava.readIntConsole("a[" + i + "]: ");

        }
        System.out.println("Even numbers are: ");
        int[] even = evenNumbers(a);
        afis(even);


        System.out.println("\n Odd numbers are: ");
        int[] odd = oddNumbers(a);
        afis(odd);

    }

    public static int[] evenNumbers(int[] x) {
        int l = x.length;
        int k = 0;
        int counter = 0;

        for (int i = 0; i < l; i++) {
            if (x[i] % 2 == 0) {
                k++;
            }
        }
        int[] e = new int[k];
        for (int i = 0; i < l; i++) {
            if (x[i] % 2 == 0) {
                e[counter] = x[i];
                counter++;
            }
        }
        return e;
    }

    public static int[] oddNumbers(int[] x) {
        int l = x.length;
        int p = 0;
        int counter = 0;

        for (int i = 0; i < l; i++) {
            if (x[i] % 2 != 0) {
                p++;

            }
        }
        int[] o = new int[p];
        for (int i = 0; i < l; i++) {
            if (x[i] % 2 != 0) {
                o[counter] = x[i];
                counter++;
            }
        }
        return o;
    }

    public static int[] afis(int[] x) {
        int len = x.length;
        if (len > 0) {
            for (int i = 0; i < len; i++) {
                System.out.print(x[i] + " ");
            }
        } else {
            System.out.print(" Empty ");
        }
        return x;
    }

}
