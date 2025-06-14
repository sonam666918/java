class MyThread extends Thread{
    public void run(){
        for(int i = 1; i <= 10; i++){
            System.out.println(getName() + "is running with priority" + getPriority());
            Thread.yield();
        }    
    }
}


public class priority {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
          MyThread t2 = new MyThread();
             
          t1.setName(" low priority thread");
          t1.setName("high priority thread");

          t1.setPriority(Thread.MIN_PRIORITY);
          t2.setPriority(Thread.MAX_PRIORITY); //

          t1.start();
          t2.start();
        
    }
    
}

