/* public class arrayb{
    public static int getnumber(int marks[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<marks.length;i++)
        {
           if(largest<marks[i])
           {
            largest=marks[i];
        }
            }
        return largest;
    }
    public static void main(String []args){
        int marks[]={45,322,4,3,355,456,46,66,44,1};
        System.out.print(getnumber(marks));
    }

// }*/
public class arrayb{
    public static int smaller(int number[]){
        int smaller=Integer.MAX_VALUE;
        for(int i=0;i<number.length;i++){

        
        if( smaller> number[i]);
        {
            smaller=number[i];
        }
        return smaller;
    }
}
    public static void main(String[]args){
        int number[]={45,35,6,33,2244,556};
    }
}
