import java .util.*;

public class array {
    public static int linearSearch(int numbers[],int key){
        for(int i=1;i<=numbers.length;i++){
            if(numbers[i]==key){
                return 1;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int numbers[]={2,4,5,6,7,8,9,10,12,14,16};
                int key =10;

                int index=linearSearch(numbers,key);
                if(index==-1){
                    System.out.println("key is at not index");
                }
                else{
                System.out.println("key is in index");
    }
}
}
