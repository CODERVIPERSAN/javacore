package java_core.multithreading;

// import chapter_10.lib;

// import lib.lib;

class MyRunnable1 implements Runnable{
    @Override
    public void run() {
        lib.print();
        System.out.print("task one ");
        lib.print();
    }
}
class MyRunnable2 implements Runnable{
    @Override
    public void run() {
        lib.print();
        System.out.print("task two ");
        lib.print();
    }
}




public class t11 {

    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable1());
        Thread t2 = new Thread( new MyRunnable2());

        t1.start();
        t2.start();
        // different task can be assigned to the different threads
    }
}
