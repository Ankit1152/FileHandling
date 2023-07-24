import java.io.File;

public class Get_file_info {
    public static void main(String[] args) {
        File f = new File("E:/file3.txt");

        if(f.exists()){
            System.out.println("The name of the file is "+f.getName());
            System.out.println("The absolute path of the file is "+f.getAbsolutePath());
            System.out.println("Is file writeable "+f.canWrite());
            System.out.println("Is file readable "+f.canRead());
            System.out.println("The length of the file is "+f.length());
        }else{
            System.out.println("File not exist");
        }
    }
}
