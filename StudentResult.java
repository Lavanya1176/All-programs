import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Total Marks: ");
        double totalMarks = input.nextDouble();
        
        System.out.print("Enter Marks Obtained by the Student: ");
        double marksObtained = input.nextDouble();
        
        double percentage = (marksObtained/totalMarks)*100;
        String grade;
        double gpa;
        
        if(percentage >= 90) {
            grade = "A";
            gpa = 4.0;
        } else if(percentage >= 80) {
            grade = "B";
            gpa = 3.0;
        } else if(percentage >= 70) {
            grade = "C";
            gpa = 2.0;
        } else if(percentage >= 60) {
            grade = "D";
            gpa = 1.0;
        } else {
            grade = "F";
            gpa = 0.0;
        }
        
        System.out.println("Percentage: " + String.format("%.2f", percentage) + "%");
        System.out.println("Grade " + grade + ", GPA = " + gpa);
    }
}
