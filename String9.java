import java.util.*;
public class String9 {
public static void Printletter(String str){
    for(int i=0;i<=str.length();i++){
        System.out.println(str.charAt(i));
    }
    System.out.println();
}

    public static void main(String args[]){
        String firstName="Pranjal";
        String lastName="Warang";
        String fullName=firstName+" "+lastName;
        System.out.println(fullName);
        Printletter(fullName);
    }
}
