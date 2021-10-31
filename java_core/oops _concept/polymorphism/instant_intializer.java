package polymorphism;

public class instant_intializer {
    final int speed;
    //blank final variable ;
    
    // instant_intializer(){
    //     System.out.print("construct block");
    // }
    {   speed =50;
        System.out.print("instant intializer block");}
    
}
// or
class equivalent{
    int var1;
    int var2;
    equivalent(){
        super(); //by the compiler
        {   var1 =1;
            var2 =2;
            System.out.println("instant intializer block");}
        System.out.println("construct block");
    }
}


class Main{
    public static void main(String[] args) {
    new instant_intializer();

    new equivalent();
        
    }
}
