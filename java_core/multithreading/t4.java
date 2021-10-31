package java_core.multithreading;

// import chapter_10.lib;

class th4 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i<5; i++) {
          try {
              lib.print(i);
            sleep(1000);  
          } catch (InterruptedException e) {

              System.out.print(e);
          }
          
            
            
        }
    }

}


public class t4 {
    public static void main(String[] args) {

        th4 t4 = new th4();
        th4 t3 = new th4();
        t4.run();
        t3.run();
        //t3 is not threaded so always call with the 
        // start method
    
    
    }
    
}
