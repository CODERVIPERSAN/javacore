package java_core.multithreading;

// import chapter_10.lib;

//method two for threading 
class th2 implements Runnable {
    @Override
    public void run() {
        lib.print();
        lib.print();

        lib.print("this is the thread is running ");
    }

}

public class t2 {
    public static void main(String[] args) {
        th2 t2 = new th2();
        Thread thread = new Thread(t2);
        thread.start();

    }
    
}
