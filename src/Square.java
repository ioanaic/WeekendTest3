/**
 * Created by Ioana on 2/25/2017.
 */
public class Square {
    public static void main(String[] args) {
        int[] arrayInt = {0, 1, 2, 3, 5, 7};
        int[] squares = new int[arrayInt.length];
        for (int i = 0; i < arrayInt.length; i++) {
            squares[i] = arrayInt[i] * arrayInt[i];

        }

        //rewrite 1
        int j=0;
        for(int arrayElem : arrayInt){
            int square = arrayElem*arrayElem;
            System.out.println(square);
            squares[j] = square;
            j++;
        }

        for (int square : squares) {
            System.out.println(square);
        }
        //rewarite 2
        for(int i = 0; i<squares.length;i++){
            System.out.println(squares[i]);

        }
    }
}
