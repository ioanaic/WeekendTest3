/**
 * Created by Ioana on 2/26/2017.
 */
public class TemaPb2Lab3 {
    //Given an array of numbers, separate elements by parity
    public static void main(String[] args) {
        int n = SkeletonJava.readIntConsole("How many numbers? ");
        int nEven, nOdd, j, k;
        j = 0;
        k = 0;
        int b[] = new int[n];
        int c[] = new int[n];
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = SkeletonJava.readIntConsole("a[" + i + "]: ");

        }
        for(int i=0;i<n;i++){
               if(isEven(a[i])){
                   j++;
                   b[j] = a[i];
                   System.out.println(b[j]);
               }else{
                   k++;
                   c[k] = a[i];
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
