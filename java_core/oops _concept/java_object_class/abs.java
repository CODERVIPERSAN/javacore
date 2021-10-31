package java_object_class;
//method in java 
//factory method 
//small piece of code of abstraction


abstract class abs1 {
    abstract void display();

    public void disp(){
        System.out.print("disp");
    }
    
}

/**
 * Innerabs
 */
public class abs extends abs1 {
    public static void main(String[] args) {
    
    //factory method which create the instance 
    //for the particular type of object 
    abs obj = abs.getDispInstance();    
    
obj.disp();
}
    @Override
    void display() {
        
    }
    public static abs getDispInstance(){
        return new abs();
    }
    

    
}
