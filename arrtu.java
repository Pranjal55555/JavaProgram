import java.util.*;
public class arrtu{
    // public static int printhello(){
    //     System.out.println("hello world");
    //     System.out.println("hello world");
    //     return 1;
    // }
    public static void calc(int a,int b){
        int sum=a+b;
        System.out.println(sum);
    }
    public static int calculatesum( int num1, int num2){
        int sum=num1+num2;
        return sum;
    }
    public static void multly(int a,int b){
        int product=a*b;
  
        System.out.print(product);
    }
    public static int factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public static void main(String args[]){
        System.out.println(factorial(8));
        
        
    }
}
