public class arrayc{
    public static int greaternumber(int number[]){
        int largest=Integer.MAX_VALUE;
        for(int i=0;i<number.length;i++){
            if (largest>number[i]){
                largest=number[i];
            }
        }
        return largest;
    }
    public static void main(String[] args){
        int number[]={45,89,69,7858,544};
        System.out.println(greaternumber(number));
    }
}