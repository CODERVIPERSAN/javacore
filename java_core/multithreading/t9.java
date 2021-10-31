package java_core.multithreading;

// import lib.lib;

class t91 implements Runnable{    
    @Override
    public void run() {
        System.out.print("message\n");
    try {
        Thread.sleep(1000);

    } catch (InterruptedException e) {
        System.out.print(e);
    }
        
    }

}

public class t9{
    public static void main(String[] args) {
       ThreadGroup tg = new ThreadGroup("gp1");
       t91 thread = new t91();
       Thread t1 = new Thread(tg,thread,"one");
       t1.start();
       Thread t2 = new Thread(tg,thread,"two");
       t2.start();
       Thread t3 = new Thread(tg,thread,"three");
       t3.start();

       System.out.print(tg);

       tg.list();
    }

}

