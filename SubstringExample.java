import java.util.Scanner;

public class SubstringExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take input string and indices
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.print("Enter the starting index: ");
        int start = scanner.nextInt();
        System.out.print("Enter the ending index: ");
        int end = scanner.nextInt();
        
        // Get the substring
        String subStr = str.substring(start, end + 1);
        
        // Display the substring
        System.out.println("Substring of " + str + " from " + start + " to " + end + " is: " + subStr);
    }
}
