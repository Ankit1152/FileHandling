import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile_using_FileReader {
    public static void main(String[] args) throws IOException{
        // variable declaration
        int ch;

        // check if file exists or not
        FileReader fr = null;
        try {
            fr = new FileReader("text");
        } catch (FileNotFoundException e) {
            System.out.println("File not found exception");
        }
 
        // Read from fileReader till the end of the file
        while((ch=fr.read()) != -1){
            System.out.print((char) ch);
        }

        // close the file
        fr.close();
    }
}
