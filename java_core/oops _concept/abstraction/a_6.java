package abstraction;
/**
 * nested interface block in java
 *
 * nested interface is static to the inter1
 * 
 * interface inside the interface 
 * 
 * class inside the class 
 * 
 * interface inside the class 
 * 
 * class inside the interface
 *  
 */
interface inter1{
    void show();
    
    
    interface inter2{
        void msg();
    }
}


public class a_6 implements inter1.inter2{
    public static void main(String[] args) {
        inter1.inter2 sh =  new a_6();
        sh.msg();
    }
    @Override
    public void msg() {
        System.out.println("this is the message");
    }
    
}
