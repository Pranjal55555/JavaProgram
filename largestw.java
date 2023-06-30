import java.util.*;
public class largestw 
{
   public static int getlargest(int numbers[]){
    int largest=Integer.MIN_VALUE;
    for(int i=0;i<=numbers.length;i++){
        if(largest<numbers[i]){
        largest = numbers[i];
    }
}
    return largest;
}
public static void main(String args[]){
    int numbers[]={2,6,2,45,678,96,3};
    System.out.println("largest value is :"+getlargest(numbers));
}
}