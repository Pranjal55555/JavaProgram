import java.util.*;

public class largest1 {
public static int largestvalue(int number[]){
    int largest=Integer.MAX_VALUE;
    for(int i=0;i<number.length;i++){
        if(largest>number[i]){
            largest=number[i];
        }
    }
    return largest;
}   
 

public static void main(String args[]){
    int number[]={45,23,455,244,5,3,53};
    System.out.println("LARGEST VALUE "+ largestvalue(number));
}
}