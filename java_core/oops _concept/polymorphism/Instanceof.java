package polymorphism;


/**
 * Parent p = new SubObject();  upcasting
 * 
 * Sub s = new ParentObject(); downcasting 
 * 
 */

class Ani{
    void sound(){
        System.out.print("sounds good");
    }
}

class Elephant extends Ani{

    void sound(){
        System.out.print("sounds hard");
    }
    static void downcast(Ani a){
        Elephant d = (Elephant) a;//downcasted
        System.out.print("downcasted sucessfully");
    }
}


public class Instanceof {
    public static void main(String[] args) {
    try {
        Ani a = new Elephant();

       Elephant.downcast(a);
       
       
       
       
       
       
       
        // Ani a  =  new Elephant(); //upcasted
        
        // //to downcast you should typecast it        
        // Elephant d = (Elephant)a;
        // d.sound();
    } catch (Exception e) {
        System.out.print("class  exception");
    }
        
}
    
}
