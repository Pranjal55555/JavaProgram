import java.nio.channels.AcceptPendingException;

public class Arrayqc{
    public static void main(String args[]){
        Pen p1=new Pen();
        p1.setcolor("blue");
        p1.setTip(5);
        System.out.print(p1.color);
        System.out.println(p1.tip);
        BankAccount myacc=new BankAccount();
        myacc.username="prana";
        myacc.password="adscvd";
    }
}
    class Pen{
        String color;
        int tip;
        String getcolor(){
            return this.color;
        }

        void setcolor(String newColor){
            color=newColor;

        }
        void setTip(int newTip){
            tip=newTip;
        }
    }
    class BankAccount{
        public String username;
        private String password;
    }
    class student{
        String name;
        int age;
        float percentage;

        void calcpercentage(int phy, int chem ,int math){
            percentage=(phy+chem+math)/2;
        }
    }
