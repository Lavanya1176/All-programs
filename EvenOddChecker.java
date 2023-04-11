import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char choice;
        do {
            System.out.println("\nMenu based app - Even/Odd Checker\n");
            System.out.print("Please enter the number: ");
            int num = input.nextInt();
            if (num % 2 == 0) {
                System.out.println("The given number - " + num + " is an EVEN Number");
            } else {
                System.out.println("The given number - " + num + " is an ODD Number");
            }
            System.out.print("\nDo you want to Continue (y/n): ");
            choice = input.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');
    }
}

