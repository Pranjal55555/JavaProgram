import java.util.*;
public class palindrome{
public static void main(String args[]){
    int temp,s=0,r;
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    temp=a;
    while(a>0){
        r=(a%10);//121 
        s=(r*r*r)+s;
        a=a/10;


    }
    if(temp==s){
        System.out.println("it is palindrome");
    }
    else{
        System.out.println("it is not palindrome");
    }

}
}