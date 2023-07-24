// Filewriter is used to creating and writing content into the file 
import java.io.FileWriter;
import java.io.IOException;

public class Write_To_file {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("E:/file3.txt");
            fw.write("My name is Ankit Kumar. I am learning file handling concepts");

            // closing the stream
            fw.close();
            System.out.println("Content successfully wrote to the file");
        } catch (IOException e) {
            System.out.println("An unexpected error is occured");
            e.printStackTrace();
        }
    }
}
