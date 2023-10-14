class A extends Thread
{
    public void run()
    {
        
         String n=Thread.currentThread().getName();
         int p=Thread.currentThread().getPriority();
       
        {
        System.out.println(n);
        System.out.println(p);
        // Thread.sleep(1000);

        }
    }
    // catch(InterruptedException i)
    // {
    //     System.out.println("Error is found");
    // }
    
}
    

class P{
    public static void main(String args[]){
    A t1=new A();
    A t2=new A();
    A t3=new A();

    t1.setName("thread 1");
    t2.setName("thread 2");
    t3.setName("thread 3");

    t1.setPriority(10);
    t2.setPriority(8);
    t3.setPriority(5);
    
    t1.start();
    t2.start();
    // t2.stop();
    t3.start();
    
  
}
}