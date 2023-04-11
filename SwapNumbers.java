import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the first number (numA): ");
        int numA = input.nextInt();
        
        System.out.print("Enter the second number (numB): ");
        int numB = input.nextInt();
        
        System.out.println("Before swapping:");
        System.out.println("numA = " + numA);
        System.out.println("numB = " + numB);
        
        // swapping the values
        int temp = numA;
        numA = numB;
        numB = temp;
        
        System.out.println("After swapping:");
        System.out.println("numA = " + numA);
        System.out.println("numB = " + numB);
    }
}

