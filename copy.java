import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class copy{
    public static void main(String args[]) throws IOException
    
         {  
        FileInputStream r=new FileInputStream("C:\\Users\\Pranjal Warang\\OneDrive\\Desktop\\myfile.txt");
        FileOutputStream w=new FileOutputStream("C:\\Users\\Pranjal Warang\\OneDrive\\Desktop\\myfeile.txt ");
        
        int i;
        while((i=r.read())!=-1){
            w.write((char)i);
        }
        System.out.println("file is success copy ");
    }
}
