import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Readstudent {
    public static void main(String[] args) throws FileNotFoundException {
        
       try{
        File file = new File("classData.csv");
        Scanner sc =new Scanner(file);
        sc.useDelimiter(",");
        while(sc.hasNext()){
            
            System.out.print(sc.next());

        }
        sc.close();

       }
       catch(Exception e){
        System.out.println(e);
       }
    }
}