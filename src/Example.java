/**
 * @author flo
 * @since 25/02/2017.
 */
public class Example {
    public static void main(String[] thisIsAnArgument) {
        System.out.println("Good bye!");

        int suma = Calc.add(2, 3);
        System.out.println(suma);  //5

        int x = SkeletonJava.readIntConsole("x=");
        int y = SkeletonJava.readIntConsole("y=");

        int sum = x;
        //int counter = y;

        //while (counter > 0) {
        for(int counter = 0;counter<y;counter++){
            sum = sum + 1;
           // counter = counter - 1;
        }
        SkeletonJava.printConsole(x + "+" + y + "=" + sum);
    }

}




