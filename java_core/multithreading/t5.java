package java_core.multithreading;

// import chapter_10.lib;

//join to wait other thread still one thread therminates

class th5 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            lib.print(i);
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
            
            
            
            
        }

    }
}


public class t5 {
    public static void main(String[] args) {
        th5 t1 = new th5();
        th5 t2 = new th5();
        th5 t3 = new th5();

        t1.start();
try {
    t1.join(2000);
    
} catch (InterruptedException e) {
    System.out.print(e);
}
    

        t2.start();
        t3.start();

        
    
    
    }

    
    
}
