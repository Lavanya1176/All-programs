import java.io.FileOutputStream;
import java.util.Scanner;
public class writingNCSVFile {
    public static void main(String[] args) {
        
        Scanner  sc = new Scanner(System.in);
        
        System.out.print("Enter the Emp ID- ");
        int empID=sc.nextInt();

        sc.nextLine();

        System.out.print("Enter the Emp Name- ");
        String empName=sc.next();
        

        String inputEMPData = "\n" + Integer.toString(empID) + "," + empName;
        // inputEMPData ="1,ABC"
        //To append its true in file
        try{
        FileOutputStream objectSaveDataINFile= new FileOutputStream("empdata.csv",true);
        byte[] inputData = inputEMPData.getBytes();
        objectSaveDataINFile.write(inputData);
        }


        catch(Exception e){
        System.out.println("Error while writing into file");
        }



        sc.close();

    }
}
