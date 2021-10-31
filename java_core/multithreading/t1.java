package java_core.multithreading;

// import chapter_10.lib;
class th1 extends Thread{
    @Override
    public void run() {
        lib.print();
        lib.print("threading is running");
    }
}


public class t1{
    public static void main(String[] args) {
            th1 t1 = new th1();
            t1.start();
    }
    
}
