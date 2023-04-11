public class Main {
    public static void main(String[] args) {
        int rows = 4; // number of rows in the triangle pattern
        int mid = (rows + 1) / 2; // middle row of the pattern

        // printing upper half of the pattern
        for (int i = 1; i <= mid; i++) {
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // printing lower half of the pattern
        for (int i = mid - 1; i >= 1; i--) {
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
