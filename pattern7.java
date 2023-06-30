public class pattern7 {
    public static void main(String arg[]){
        int m=5;
        for(int i=1;i<=m;i++){
            // for space
        for(int j=1;j<=m-i;j++){
            System.out.print(" ");
        }
        // 1st half number
        for(int j=i;j>=1;j--){
            System.out.print(j);
        }
        // System.out.println();
        // 2st half numbers
        for(int j=2;j<=i;j++){
            System.out.print(j);
        }
        System.out.println("");
        }
    }
}
