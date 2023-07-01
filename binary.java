public class binary{
    public static void reverse(int number[]){
        int first=0,last=number.length-1;
        while(first<last){
            int temp=number[last];
            number[last]=number[first];
            number[first]=temp;
            first++;
            last--;
        }
    }
    public static void main(String[]args){
        int number[]={45,78,54,35,2,44};
            reverse(number);
        for(int i=0;i<number.length-1;i++){
          System.out.println(number[i]);   
        }
    }
}