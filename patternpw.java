public class patternpw {
    public static void hollow_rectangle(int totalrows, int totalcolls) 
    {
        for (int i = 1; i <= totalrows; i++) {
            for (int j = 1; j <= totalcolls; j++) {
                if (i == 1 || i == totalrows || j == 1 || j == totalcolls) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
       
    }
  public static void inversted_rotated_half_pyramid(int n){
    for(int i=1;i<=n;i++)
    {
        // for(int j=1;j<=n-i;j++)
        // {
        //     System.out.print(" ");
        // }
        for(int j=1;j<=i;i++)
        {
            System.out.print(j);
        }
        System.out.println();
    } 
    
}
public static void patternpo(int n){
    for(int i=1;i<=n;i++){
        // stars
        for(int j=1;j<=i;j++){
            System.out.print(" * ");
        }
        for(int j=1;j<=2*(n-1);j++){
            System.out.print(" ");
        }
         for(int j=1;j<=i;j++){
            System.out.print(" * ");
        }

        System.out.println();
    }
   
}
    public static void main(String args[]) {
       patternpo(4);;
    }
}
