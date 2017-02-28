/**
 * Created by Ioana on 2/28/2017.
 */
public class NameAndSurname {
    public static void main(String[] args) {
        int n = SkeletonJava.readIntConsole("How many names? ");
        //String[][] a = new String[100][100];
        String[] name = new String[n];
        String[] prenume = new String[n];
        int[] datanasterii = new int[n];
        for (int i = 0; i < n; i++) {

            //a[i][i] = SkeletonJava.readStringConsole("a[" + i + "][" + i + "]");
            name[i] = SkeletonJava.readStringConsole("Nume?");
            prenume[i] = SkeletonJava.readStringConsole("Prenume");
            datanasterii[i] = SkeletonJava.readIntConsole("Ziua");


        }
        System.out.println("Numele sunt: ");
        for (int i = 0; i < n; i++) {
            System.out.println(name[i] + "+" + prenume[i] + name[i].length() + datanasterii[i]);
        }
    }
}
