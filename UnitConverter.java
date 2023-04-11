import java.util.Scanner;

public class UnitConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char choice;
        do {
            System.out.println("\nMenu based app - Unit conversion for Distance\n");
            System.out.println("1. CM to M");
            System.out.println("2. M to KM");
            System.out.println("3. KM to M");
            System.out.println("4. M to CM");
            System.out.print("\nEnter your menu: ");
            int menu = input.nextInt();

            switch (menu) {
                case 1:
                    System.out.print("Please enter the CM value: ");
                    double cm = input.nextDouble();
                    double m = cm / 100.0;
                    System.out.printf("%.2f CM = %.2f M\n", cm, m);
                    break;
                case 2:
                    System.out.print("Please enter the M value: ");
                    double m2 = input.nextDouble();
                    double km = m2 / 1000.0;
                    System.out.printf("%.2f M = %.2f KM\n", m2, km);
                    break;
                case 3:
                    System.out.print("Please enter the KM value: ");
                    double km2 = input.nextDouble();
                    double m3 = km2 * 1000.0;
                    System.out.printf("%.2f KM = %.2f M\n", km2, m3);
                    break;
                case 4:
                    System.out.print("Please enter the M value: ");
                    double m4 = input.nextDouble();
                    double cm2 = m4 * 100.0;
                    System.out.printf("%.2f M = %.2f CM\n", m4, cm2);
                    break;
                default:
                    System.out.println("Invalid menu choice!");
                    break;
            }

            System.out.print("\nDo you want to Continue (y/n): ");
            choice = input.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');
    }
}
