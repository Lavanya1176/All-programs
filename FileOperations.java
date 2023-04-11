import java.io.*;

public class FileOperations {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int choice = 0;
        do {
            System.out.println("\nMenu based app - File Operations in Java");
            System.out.println("1. Create a new folder");
            System.out.println("2. Create a new text file");
            System.out.println("3. Write into a text file");
            System.out.println("4. Append data to a text file");
            System.out.println("5. Rename a file");
            System.out.println("6. Delete a File");
            System.out.println("7. Exit");
            System.out.print("Please enter the Menu: ");
            choice = Integer.parseInt(br.readLine());
            switch (choice) {
                case 1:
                    createFolder();
                    break;
                case 2:
                    createTextFile();
                    break;
                case 3:
                    writeToFile();
                    break;
                case 4:
                    appendToFile();
                    break;
                case 5:
                    renameFile();
                    break;
                case 6:
                    deleteFile();
                    break;
                case 7:
                    System.out.println("Thank you for using the File Operations App");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 7);
    }

    public static void createFolder() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter the Folder-name to be Created: ");
        String folderName = br.readLine();
        System.out.print("Please enter the Path where you wish to save a new folder: ");
        String path = br.readLine();
        File file = new File(path + "\\" + folderName);
        if (file.exists()) {
            System.out.println("Folder already exists.");
        } else {
            boolean created = file.mkdir();
            if (created) {
                System.out.println("Folder is created Successfully!");
            } else {
                System.out.println("Failed to create folder. Please try again.");
            }
        }
        goBackToMenu();
    }

    public static void createTextFile() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter the File-name to be Created: ");
        String fileName = br.readLine();
        System.out.print("Please enter the Path where you wish to save a new file: ");
        String path = br.readLine();
        File file = new File(path + "\\" + fileName);
        if (file.exists()) {
            System.out.println("File already exists.");
        } else {
            boolean created = file.createNewFile();
            if (created) {
                System.out.println("File is created Successfully!");
            } else {
                System.out.println("Failed to create file. Please try again.");
            }
        }
        goBackToMenu();
    }

    public static void writeToFile() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter the path: ");
        String path = br.readLine();
        System.out.print("Please enter the File-Name: ");
        String fileName = br.readLine();
        System.out.print("Please enter the file-content-data: ");
        String data = br.readLine();
        FileWriter fw = new FileWriter(path + "\\" + fileName);
        fw.write(data);
        fw.close();
        System.out.println("Data is written to file Successfully!");
        goBackToMenu();
    }

    public static void appendToFile() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    }
