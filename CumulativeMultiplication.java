import java.util.*;

public class CumulativeMultiplication {
    public static void main(String[] args) {
        int[] arrNum = {5, 3, 4, 2, 0, 8};
        try {
            for (int i = 1; i < arrNum.length; i++) {
                arrNum[i] *= arrNum[i-1];
            }
            System.out.print("Output: ");
            System.out.println(Arrays.toString(arrNum));
        } catch (Exception e) {
            System.out.println("Exception caught: " + e);
        }
    }
}
