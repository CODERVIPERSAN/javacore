package ;
abstract class Bike{
    Bike(){
        System.out.print("bike is created");
    }
    abstract void run();
    void  changeGear(){
        System.out.print("Gear changed ");
    }

}
public class a_1 {
    public static void main(String[] args) {
        Bike obj = Honda$.getHondaInstant();//upcasting
        getObj(obj);
        System.out.println();
        obj.changeGear();
        System.out.println();
    }
    public static void getObj(Bike obj){
    if(obj instanceof Honda$){

        System.out.println();
        Honda$ honda = (Honda$)obj;//downcast 
        honda.run();
        System.out.println();
    
    }
    }

    
}
class Honda$ extends Bike{
    @Override
    void run() {
        System.out.print("running safely");
    }

    static Honda$ getHondaInstant(){
        return new Honda$();
    }
}
