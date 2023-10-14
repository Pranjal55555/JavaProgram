import java.util.Arrays;

public class sortinglecture {
    public static void insertionsort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int key=arr[i];
        
            int j=i-1;
            while(j>=0 && key<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
             arr[j+1]=key;
        }
        
    }

    public static void main(String[] args) {
        int arr[] = { 2, 8, 9, 10, 74, 6, 5 };
        System.out.println(Arrays.toString(arr));
        insertionsort(arr);
    }
}