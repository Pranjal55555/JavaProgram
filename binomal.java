import java.util.*;
public class binomal
{
    public static int binarysearch(int marks[],int key){
    int start=0,end=marks.length-1;
        while(start<=end){
            int mid=(start + end)/2;

            if(marks[mid]==key){
                return mid;
            }
            if(marks[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }

 public static void main(String args[]){
    int marks[]={84,45,2,455,667,3,67,4,6};
    int key=3;

    System.out.println(binarysearch(marks, key));
 }   
}
