import java.io.FileInputStream;

public class CSVReader {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("classData.csv");
            byte[] buffer = new byte[1024];
            int length = 0;
            StringBuilder sb = new StringBuilder();

            while ((length = fis.read(buffer)) != -1) {
                sb.append(new String(buffer, 0, length));
            }

            String[] rows = sb.toString().split("\n");

            for (int i = 0; i < rows.length; i++) {
                String[] data = rows[i].split(",");
                String name = data[0];
                int marks1 = Integer.parseInt(data[1]);
                int marks2 = Integer.parseInt(data[2]);
                int marks3 = Integer.parseInt(data[3]);
                int totalMarks = marks1 + marks2 + marks3;
                System.out.println(name + " - Total Marks: " + totalMarks);
            }
            fis.close();
        } catch (Exception e) {
            System.out.println("Exception caught: " + e);
        }
    }
}
