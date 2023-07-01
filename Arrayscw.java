public class Arrayscw{
    public  static void pairs(int number[]){
     for(int i=0;i<number.length;i++){
        int current=number[i];
        for(int j=i+1;j<number.length;j++){
            System.out.print("("+current+","+number[j]+")");
          
        }
        System.out.println();
     }
    }
    public static void main(String []args){
        int number[]={56,76,764,32,54,53};
        pairs(number);
    }
}