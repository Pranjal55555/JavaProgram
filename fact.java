import java.util.*;
public class fact {
    public static void main(String args[]){
        int n,fact=1 ;
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for( int i=1;i<=a;i++)
        {
             fact=(fact*i);
            // 1*1=1*2=2*3=6*4=24*5=120*6=720
            
        }
        System.out.println(fact);
       
    }
}
