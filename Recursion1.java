public class Recursion1{
    public static int factorial(int n){
        if(n==1||n==0){
            return 1;
        }
        int fact_m1=factorial(n-1);
        int factn=n*fact_m1;
        return factn;
    }
    public static void main(String args[]){
        int n =5;
        int ans=factorial(n);
        System.out.println(ans);
    }
}