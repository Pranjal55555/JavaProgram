class A{
    int x,y;
    A(int a,int b){
       x=a;y=b;
    }
    A(String a,String b){
       System.out.println(a+ "=" +b);
    }
    void pw(){
        System.out.println(x+""+y);
    }
    
}
public class cont{
    public static void main(String args[]){
        A r=new A(98,87);
        A ref=new A("Pranjal","Don");
        r.pw();
    }
}