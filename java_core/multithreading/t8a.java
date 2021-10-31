package java_core.multithreading;

// import chapter_10.lib;

// import lib.lib;

public class t8a implements Runnable{
    private String mess;
    t8a(String mess){
        this.mess = mess;
    }
    @Override
    public void run() {
    
        System.out.print("start "+Thread.currentThread().getName()+" " +this.mess);
        lib.print();
        myfunc();
        lib.print();
        System.out.print("end "+Thread.currentThread().getName()+" " +this.mess);
        lib.print();

        
    }

    public void  myfunc(){
        try {
            Thread.sleep(5000);    
        } catch (InterruptedException e) {
            e.printStackTrace();            
        }
        
    }

    
}
