package polymorphism;
class Animals{
    void eat(){System.out.print("eating ");}
}

class Dog extends Animals{
    @Override
    void eat() {
        System.out.print("dog eating ");
    }
}

class Lion extends Animals{
    @Override
    void eat() {
        System.out.print("lion eating ");
    }
}
class poly extends Thread{
    @Override
    public void run() {
        run_poly1.other();
    }
}
/**
 * run_poly1
 */
public class run_poly1 extends Thread {
    @Override
    public void run() {
        
        Animals a1,a2,a3;
        a1 = new Animals();
        
        a2 = new Dog();
        System.out.print("{"+(a2 instanceof Animals)+"]");
        a3 = new Lion();
        // Thread th = new Thread();
        // th.sleep(100);

        a1.eat();
        a2.eat();
        a3.eat();
    }
//concept mulithreading +runtime polymorphism 
    

    public static void other(){
        System.out.print("hello this is other task alloted to the thread");
    }
     public static void main(String[] args) {
        
        run_poly1 th;
        th = new run_poly1();
        System.out.print(th instanceof run_poly1);
        poly th1 = new poly();
        
        th.start();
        try {
            Thread.sleep(100);    
        } catch (InterruptedException e) {
            System.out.print("handled");
        }
        th1.start();
        
    }
}