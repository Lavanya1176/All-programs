public import java.io.*;

public class CharacterCount {
    public static void main(String[] args) {
        String fileName = "C:\java\Javacode\HeroVired.txt";
        File file = new File(fileName);
        int charCount = 0;

        try {
            FileReader reader = new FileReader(file);
            int character;

            while ((character = reader.read()) != -1) {
                charCount++;
            }

            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        System.out.println("Total number of characters in file are: " + charCount);
    }
}
 {
    
}
