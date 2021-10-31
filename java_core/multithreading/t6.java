package java_core.multithreading;

// import chapter_10.lib;

class th6 extends Thread{
    static int i =0;
    @Override
    public void run() {
        i++;
        

       
        try {
            lib.print();
            System.out.print(i);
            lib.print();
            System.out.print(Thread.currentThread().getPriority());
            System.out.println(this.getName());
            lib.print("running threads");
            sleep(1000);
        } catch (Exception e) {
            System.out.print(e);
        }
}

}


public class t6 {
    public static void main(String[] args) {
        
        th6 t1 = new th6();
        th6 t2 = new th6();

        lib.print("thread1 "+t1.getName());

        lib.print("thread2 "+t2.getName());

        t1.setName("thread-0");

        lib.print(t1.getName());
        t1.setPriority(1);
        t2.setPriority(10);

        t1.start();
        t2.start();

    }
    
}
