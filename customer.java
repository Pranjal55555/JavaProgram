class Bus implements Runnable
{
    
    int available =2,passenger;
    Bus(int passenger){
        this.passenger=passenger;  //passeger 1
        

    }
    public synchronized void run(){
        String name=Thread.currentThread().getName();
        if(available>=passenger){
            System.out.println(name+ "seat is booked");
            available=available-passenger;
        }
        else{
            System.out.println("seat is not available");
        }
    }
}
class customer
{
    public static void main(String args[]){
    Bus r=new Bus(1);
    Thread t1=new Thread(r);
    Thread t2=new Thread(r);
    Thread t3=new Thread(r);

    t1.setName("Raju");
    t2.setName("Shivam");
    t3.setName("pranjal");

    t1.start();
    t2.start();
    t3.start();
    }
}