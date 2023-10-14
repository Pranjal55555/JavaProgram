public class product3 {
    
    public static int factorial(int n){
        int p=1;
        for(int i=1;i<=n;i++){
             p=p*i;
        }
        return p;
    }
    public static boolean isPrime(int n){
        for(int i=2;i<=Math.sqrt(8);i++){
            if(n%i==2){
                return false;
            }
            
        }
          return true;
    }
    public static void primeInrange(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.println(i+" ");
            }
            System.out.println();
        }
    }
    public static void bintodec(int binnum){
        int decnumber=0;
        int power=0;

        while(binnum>0){
        int lastdist=binnum%10;
        decnumber=decnumber+(lastdist*(int)Math.pow(2, power));
        power++;
        binnum=binnum/10;
        
        }
        System.out.println("decimal of"+binnum+"="+decnumber);
    }
    public static void decToBin(int n){
        int power=0;
        int binnum=0;
        while(n>0){
            int rem=n%2;
            binnum=binnum+(rem*(int) Math.pow(10,power));
            power++;
            n=n/2;
        }
    }
    public static int binCoeff(int n,int r){
        int factor_n=factorial(n);
        int factor_r=factorial(r);
        int factor_nmr=factorial(n-r);

        int bincoeff=factor_n/(factor_r*factor_nmr);
        return bincoeff;
    }
    public static void main(String  args[]){
     bintodec( 101);
    }

}
