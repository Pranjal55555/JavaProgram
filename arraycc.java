import java.util.*;
public class arraycc{
    public static void reverse(int number[])
    {
        int first=0,last =number.length-1;

         while(first<last){
            int temp=number [last];
            number[last]=number[first];
            number[first]=temp;
            first++;
            last--;
         }
    }
    public static void main(String args[]){
        int number[]={12,45,54,3,22,22,21};
        reverse(number);
        for(int i=1;i<number.length;i++);
        int i;
        System.out.print(number[i]+" ");
        System.out.println();
    }
    
}