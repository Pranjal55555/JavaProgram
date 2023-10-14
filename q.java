class A{
    int a;int b;String c;
    A(){
        a=100;b=98;c="Pranjal";
        System.out.println(a+" "+b+" "+c);
    }
    A(int x){
        a=x;
    }
    A(int x,String y){
        a=x;c=y;
    }
}
public class q{
    public static void main(String args[]){
        A r=new A();
        A r1=new A(10);
        A r2=new A(100,"rnajal");

        System.out.println(r.a+" "+r.b+" "+r.c);
        System.out.println(r1.a+" "+r1.b+" "+r1.c);
        System.out.println(r2.a+" "+r2.b+" "+r2.c);

    }
}