import java.io.*;
public class mp {
    public static void main(String args[]){
        String str;char ch[];
        Console obj=System.console();
        System.out.println("Enter userName");
        str=obj.readLine();
        System.out.println("Enter your password");
        ch=obj.readPassword();

        System.out.println("username:"+str);
        System.out.println("Password:"+ch);

    }
}
