public class String6{
    public static void printnumber(String po){
        for(int i=0;i<po.length()/2;i++){
            int n=po.length();
           if(po.charAt(0)==po.charAt(n-1-i)){
            System.out.println("it is palindrome ");
           }
           else{
            System.out.println("it is not palindrome");
           }
        }
        System.out.println();
    }
    public static void main(String []args){
        printnumber(noor);
        

        
    }
} 