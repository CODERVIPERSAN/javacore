package java_core.java_synchronization;
interface logic{


class rand{
    public  static  int randno(){
        int value =  (int )(Math.random()*10);
        // System.out.println(value);
        return value;
    }
}

class Square extends Thread{
    int n;
    Square(int n){
        this.n =n;
        this.start();

    }
    synchronized int square(){
        return n*n;
    }
    @Override
    public void run() {
        System.out.println(String.format("random number is %d and the square of the number is %d", n,square()));
        // System.out.println();
    }

}

class Cube extends Thread{
    int n;
    Cube(int n){
        this.n=n;
        this.start();
    }
    synchronized int cube(){
        return n*n*n;
    }

    @Override
    public void run() {
        System.out.println(String.format("random number is %d and the cube of the number is %d", n,cube()));
        // System.out.println();    
    }

}

}

public class jsy {
    public static void main(String[] args) {
       for (int i = 0; i < 10; i++) {
           
       
        int rand = logic.rand.randno();
    //    System.out.println(rand);
        Thread t;
        if (rand%2==0) {
            t= new logic.Square(rand);
            
            // t.start();
            // System.out.println(Math.random()*100);
        } else {
            t= new logic.Cube(rand);
            try {
                
                Thread.sleep(1000);
                System.out.println();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            // t.start();

            
        }
    }

    }
    
}
