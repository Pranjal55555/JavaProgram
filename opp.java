public class opp {
    public static void main(String args[]){
        Student s1=new Student();
        Student s2=new Student("pranjal");
        Student s3=new Student("123");
    }
    class Student{
        String name;
        int rollno;

        Student(){
            System.out.println("constructor is called");
        }
        Student(String name){
            this.name=name;
        }
        Student(int rollno){
            this.rollno=rollno;
        }
    }
}
