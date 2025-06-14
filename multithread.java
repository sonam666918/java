/*class MyRunnable implements Runnable{
    public void run(){
        System.out.println(Thread.currentThread().getName()+ "hlwwww");
    }
} 

public class multithread {
    public static void main(String[] args) {
        MyRunnable obj = new MyRunnable();
        Thread t1 = new Thread(obj);
        t1.start(); 

    }
    
}
*/


/*
class WithdrawThread extends Thread{
    static int totalBalance=1000;
    int ammount;

    public WithdrawThread(int ammount){
        this.ammount=ammount;
    }

    public void run(){
    
        if(totalBalance>=ammount){
            System.out.println("paisa apke pass aa jayega" + ammount);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // TODO auto generated catch block
                e.printStackTrace();
            }
            totalBalance-=ammount;
            System.out.println(totalBalance);

        }else{
            System.out.println("mai gareeb hu paisa nhi hai");
        }
    }
}

public class multithread{
    public static void main(String[] args) {
        WithdrawThread obj = new WithdrawThread(800);
        WithdrawThread obj2 = new WithdrawThread(500);
        
        obj.start();
        try {
            obj.join();
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
        obj2.start();
    }
}*/

/* 
class WithdrawThread extends Thread{
    static int totalBalance=1000;
    int ammount;

    public WithdrawThread(int ammount){
        this.ammount=ammount;
    }

    public void run(){
    synchronized(WithdrawThread.class){
        if(totalBalance>=ammount){
            System.out.println("paisa apke pass aa jayega" + ammount);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // TODO auto generated catch block
                e.printStackTrace();
            }
            totalBalance-=ammount;
            System.out.println(totalBalance);

        }else{
            System.out.println("mai gareeb hu paisa nhi hai");
        }
    }
}
}
public class multithread{
    public static void main(String[] args) {
        WithdrawThread obj = new WithdrawThread(800);
        WithdrawThread obj2 = new WithdrawThread(500);
        
        obj.start();
        
        obj2.start();
    }
}

*/
public class multithread{
    public static void main(String[] args) {
        System.out.println("see here");
        Thread t1 = new Thread(()->{
            System.out.println("hello");

        });
       
         
        Thread t2 = new Thread( ()->{
            System.out.println("hiiii");
       
    });

    t1.start();
    t2.start();

}
}
