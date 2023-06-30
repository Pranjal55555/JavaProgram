import java.util.*;
class pen{
    String color;
    String type;

    // public static void write(){
    //     System.out.println("writing something");

    // }
    // public  void printcolor(){
    //     System.out.println(this.color);
    }
    class Student{
        String name;
        int age;

        public void printpw(){
            System.out.println(this.name);
            System.out.println(this.age);
        }
    }

public class oop {
    public static void main(String arg[]){
        // 
        Student s1= new Student();
        s1.name="a";
        s1.age=12;

        s1.printpw();
    }
}
