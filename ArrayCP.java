import java.util.*;
public class ArrayCP{
    public static int Arrayd(int number[],int key){
        for(int i=0;i<number.length;i++){
            if(number[i]==key){
               return i; 
            }
        }
        return-1;
    }

    public static void main(String args[]){
        int number[]={34,5,3,4,32,45,67};
        int key=4;
         
        int index =Arrayd(number,key);
        if(index==-1){
            System.out.println("not found");
        }
        else{
            System.out.println("found");
        }
    }
}