import java.io.File;

public class rename {
    public static void main(String args[]){
        File f=new File("C:\\Users\\Pranjal Warang\\OneDrive\\Desktop\\myfile.txt");
        // File w=new File("C:\\Users\\Pranjal Warang\\OneDrive\\Desktop\\myfily.txt");
        if(f.exists()){
            System.out.println("file name"+f.getName());
            System.out.println("file location "+f.getAbsolutePath());
            System.out.println("file writeable"+f.canWrite());
            System.out.println("file readable"+f.canRead());
            System.out.println("file size"+f.length());            

        }
        else{
            System.out.println("file not found");
        }
    }
    
}
