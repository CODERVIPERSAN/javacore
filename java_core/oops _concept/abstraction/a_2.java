package abstraction;
//abstraction using interface 
/**
 * interface will not force you to override all the method
 * which is declared in the interface 
 */
interface vehi2{

}
interface vehicle {
    void a();
    void b();
    default void c(){
        System.out.println("this is c");
    }
    void d();
}
//this is a muliple inheritance  two parent having one child 
abstract class Bik implements vehicle ,vehi2{
    public void c(){
        System.out.println("Iam c");
    }
}

abstract class car implements vehicle{
    public void d(){
        System.out.println("Iam d");
    }
}

class hooda extends Bik{
    @Override
    public void a() {
        
    }
    @Override
    public void b() {
        
    }
    @Override
    public void d() {
        
    }
}

/**
 * if two or more interface is there then
 * 
 * abstract class may or may not implement all the abstart method in the interface 
 *  
 * class will need to implement remaining abstract method if inherited 
 */

