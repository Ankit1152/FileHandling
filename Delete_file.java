import java.io.File;

public class Delete_file {
    public static void main(String[] args) {
        File f = new File("E:/demo.txt");

        if(f.delete()){
            System.out.println(f.getName()+" file deleted successfully");
        }else{
            System.out.println("Error found in deletion of the file");
        }
    }
}
