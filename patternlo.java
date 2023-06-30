public class patternlo{
    public static void patterew(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n+1;i++){
                if(i%2!=0){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        
    }

public static void main(String args[]){
    patterew(5);
}
}