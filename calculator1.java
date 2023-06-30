import java.util.*;
public class calculator1 {
public static void main(String args[]){
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter your a :");
    int a=sc.nextInt();
    System.out.println("Enter your b :");
    int b=sc.nextInt();
    System.out.println("enter your opertors :");
    char operator= sc.next().charAt(0);
    switch (operator){
        case '+':System.out.println(a+b);
        break;
        case '-':System.out.println(a-b);
        break;
        case '*':System.out.println(a*b);
        break;
        case '/':System.out.println(a/b);
        
        default:System.out.println("invalid number");
    }

}    
}
