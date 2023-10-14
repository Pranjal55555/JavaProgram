import java.util.*;
public class primenumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0){
                sum=sum+i;
            }
            if(n==sum){
                System.out.println("is prime number");
            }
            else{
                System.out.println("is not prime number");
            }
        }
    }
}
