public class recursion{
    public static void printnum(int i,int n,int sum){
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        printnum(i+1,n,sum);
        System.out.println(i);

    }
    public static void main(String args[]){
        printnum(1,5,0);
    }
}