import java.io.File;
// importing FileNotFoundException class for handling errors
import java.io.FileNotFoundException;
// importing scanner class for reading text files
import java.util.Scanner;

public class Read_file {
    public static void main(String[] args) {
        try {
            // Create f object of the file to read data 
            File f = new File("E:/file3.txt");

            // It reads the data from the file and putting inside the datareader obj
            Scanner dataReader = new Scanner(f);
            while (dataReader.hasNextLine()) {
                String fileData = dataReader.nextLine();
                System.out.println(fileData);
            }
            // because of data security we have to close the file
            dataReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An unexpected error occured");
            e.printStackTrace();
        }
    }
}
