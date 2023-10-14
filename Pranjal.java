class Student{
    int rollno,marks;
    String name;
    void input(){
        System.out.println("Enter rollno ");
    }
}
class Pranjal extends Student
{
    void disp(){
    rollno=1;name="Pranjal";marks=85;
    System.out.println(rollno +""+name+" "+marks);
    }

public static void main(string args[]){
    Pranjal r=new Pranjal();
    r.input();
    r.disp();
}
}