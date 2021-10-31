package java_core.multithreading;

class th7 extends Thread{
    @Override
    public void run() {
        if(super.currentThread().isDaemon()){
            System.out.print("this is the daemon thread");
        }
        else{
            System.out.println("this is user thread");
        }
    }
}


public class t7 {
    public static void main(String[] args) {
        
        th7 t1 = new th7();
        th7 t2 = new th7();
        th7 t3 = new th7();
        
t1.setDaemon(true); //t1 is the deaemon thread
//daemaon thread is the service provider for user thread
t2.setDaemon(true);
// t3.setDaemon(true);

        t1.start();
        t2.start();
        t3.start();


    }
    
}
