// import java.util.*;
// public class Strings {
//     public static void printletter(String str){
//         for(int i=0;i<str.length();i++){
//             System.out.print(str.charAt(i)+" ");
//         }
//     }
//     public static void main(String args[]){
//         // char arr[]={'a','b','c','d'};
//         // String str=new String("xyz");

//         // Scanner sc=new Scanner(System.in);
//         // String name;
//         // name=sc.nextLine();
//         // System.out.print(name);
//         // String fullName="pranjal warang";
//         // System.out.println(fullName.length());
//         String firstName="Pranjal";
//         String lastName="Warang";
//         String fullname=firstName+" "+lastName;
        
//         printletter(fullname);
//     }
// }
public class Strings{
    public static void printletter(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
    }
    public static boolean ispalindrome(String ng){
        for(int i=0;i<ng.length()/2;i++){
            int n= ng.length();
            if(ng.charAt(i)!=ng.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
       
        String s1="Pranjal";
        String s2="Pranjal";
        String s3= new String("Pranjal");

        if(s1==s2){
            System.out.println("string are equal" );
        }else{
            System.out.println("String are not equal");
        }
        if(s1.equals(s3)){
             System.out.println("string are equal" );
        }else{
            System.out.println("String are not equal");
        }
    }
}