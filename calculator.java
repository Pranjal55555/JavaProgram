import java.util.*;
public class calculator{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number");
        double num1=sc.nextDouble();
        System.out.println("Enter second number");
        double num2=sc.nextDouble();
        System.out.println("enter the operator");
         char operator=sc.nextLine().charAt(0);
         double result=0.0;
        switch(operator){
            case '+':
                result=num1+num2;
                break;
            case'-':
                result=num1-num2;
                break;
            case'*':
                result=num1*num2;
                break;
            case'%':
                result=num1/num2;
                break;
            default:
                System.out.println("invaid number");
            break;
        }
         System.out.println(num1+" "+ operator+" "+ num2 + "=" + result);
        
        sc.close();
        
        }
    }
