public class test3{
    public static void main(String arg[]){
        pen p1=new pen();
        p1.setcolor("organa");
        System.out.println(p1.color);
        bank myacc=new bank();
        myacc.account="pranjal";
        myacc.password="pood";
    }
}
class bank{
    public String account;
    private String password;
}
class pen{
    String color;
    int tip;
    void setcolor(String newcolor){
        color=newcolor;
    }
}