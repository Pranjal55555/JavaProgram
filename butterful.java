import javax.sound.sampled.SourceDataLine;

public class butterful{
    public static void butterful(int n ){
    
        for (int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            int space=2*(n-i);
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    


        for(int i=n;i>=1;i--)
            {
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            // spaces
            int spaces=2*(n-i);
            for(int j=1; j<=spaces;j++){
                System.out.print(" ");
            }

            // second part
            for(int j=1;j<=i;j++){
                System.out.print("*");

            }
            System.out.println();
    }
    }public static void main(String args[]){
        butterful(8);
    }
}
            