public class pattern1 {
    public static void main(String args[]){
        int n=41;
        int k=5;
        // outer loop
        for(int i=1;i<=n;i=i+k){
            for(int j=i;j<=n; j++){
                System.out.print(i);
            }
            System.out.println();           
        }
    }
}
