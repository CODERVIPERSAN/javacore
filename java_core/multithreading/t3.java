package java_core.multithreading;
//sleep method in java 

// import chapter_10.lib;

class th3 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            lib.print(i);
            try {
                super.sleep(1000);    
            } catch (InterruptedException e) {
                System.out.println(e);
                
            }
            
            
            
            
        }
    }
}



public class t3 {
    public static void main(String[] args) {
        th3 t3 = new th3();


        
        th3 t4 = new th3();
        t3.start();
        t4.start();
        // t3.start();//illegal thread state exception 
    }

    
}
