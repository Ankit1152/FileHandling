import java.io.File;
import java.io.IOException;

public class Create_File {
    public static void main(String[] args) {
        try {
            // creating an object of the file class
            File f = new File("E:/file3.txt");
            
            if(f.createNewFile()){
                System.out.println(f.getName()+" file created successsfully");
            }else{
                System.out.println("file is already exist in the directory");
            }
        } catch (IOException e) {
            System.out.println(e);
            e.printStackTrace();
        }
       
    }
}

// Stream - Series of data
// ByteStream - Input stream classes and output stream classes
// CharacterStream - Reader classes and Writer classes