class A extends Thread{
    public void run(){
        String n=Thread.currentThread().getName();
        for(int i=0;i<=5;i++){
            System.out.println(n);
        }
    }
}
class B{
    public static void main(String arg[]){
    A t1=new A();
    A t2=new A();
    A t3=new A();

    t1.setName("thread 1");
    t2.setName("thread 2");
    t3.setName("thread 3");
}
}