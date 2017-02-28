/**
 * Created by Ioana on 2/28/2017.
 */
public class SquareOddAndDoubleEven {

    public static void main(String[] args) {
        int[] input = {1, 5, 4, 6, 12, 13};
        int[] output = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            if (input[i] % 2 != 0) {

                output[i] = input[i] * input[i];
            } else {
                output[i] = input[i] * 2;
            }

        }
        System.out.println("Output este: ");
        for (int i = 0; i < input.length;i++) {
            System.out.println(output[i] + " ");
        }
    }
}
