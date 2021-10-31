
package java_core.multithreading;
import java.lang.Runnable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;




public class t8 {
public static void main(String[] args) {
    //five pool of threads
    ExecutorService ex = Executors.newFixedThreadPool(5);

    for (int i = 0; i < 10; i++) {
    
        Runnable imp = new t8a("mess"+i);
        ex.execute(imp);

    }

    ex.shutdown();

    while (!(ex.isTerminated())) {
}
System.out.print("yes it is terminated");
    
}
}