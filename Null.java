public class Null{
    public static void main(String args[])
    {
        
        
        try{
             
            int a=9,b=9,c;
            c=a/b;
            int ae[]={45,56,75,67};
            System.out.println(ae[1]);
            String Str="pranjal";
            System.out.println(Str.toUpperCase());
        }
        catch(ArrayIndexOutOfBoundsException r){
            System.out.println("not found");
        }
        catch(ArithmeticException n){
            System.out.println("zero is not divisible by a");
        }
        catch(NumberFormatException y){
            System.out.println("number cannot found");
        }
        }
    }

    
    
