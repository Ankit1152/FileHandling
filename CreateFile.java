import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) throws IOException{
        String str = "File handling in Java using "+
                    "File Writer and File Reader";

        FileWriter fw = new FileWriter("E:/anothefile.txt");

        // Read characters from the string and write into the file
        for(int i=0; i<str.length(); i++){
            fw.write(str.charAt(i));
        }

        System.out.println("Writing successfully");

        // close the file
        fw.close();

    }
}
