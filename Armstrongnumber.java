import java.util.*;
public class Armstrongnumber{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int arm=0,temp,rem;
        int num=sc.nextInt();
        temp=num;
        while(num>0)
        {
            rem=num%10;
            arm=(rem*rem*rem)+rem;
            num=num/10;

        }
        if(temp==num)
        {
            System.out.print("The given number is armstrong");
        }
        else
        {
            System.out.print("The given number is not armstrong");
        }
    }
}