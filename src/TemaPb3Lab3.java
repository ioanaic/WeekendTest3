/**
 * Created by ioana.crisan on 27-02-2017.
 */
public class TemaPb3Lab3 {

//TEST TEST TESTES TESTEST
    //    Given an array of numbers, check if the elements are increasingly sorted
//    (hint) check adjacent pairs for the order relatio
    public static void main(String[] args) {
        int n = SkeletonJava.readIntConsole("How many numbers? ");
        int[] a = new int[n];
        for (int i = 0; i < n; ) {
            a[i] = SkeletonJava.readIntConsole("a[" + i + "]: ");
        }
    }

    public static void afisNumbers(int[] x) {
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i] + " ");
        }
    }

    public static boolean checkiIsIncreasinglyOrderd()

    {
        return true;
    }
}


