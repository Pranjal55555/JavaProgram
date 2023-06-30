import java.util.*;
public class arrays{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        int number[]=new int[size];
    // System.out.println(marks[2]);
    for(int i=0;i<size;i++)
    {
     number[i]=sc.nextInt();
    }
    for(int i=0;i<size;i++)
    {
        System.out.print(number[i]);
    }
    }
}