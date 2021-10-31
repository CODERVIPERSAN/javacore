package abstraction;
/**
 * interface is a blue print of the class 
 * 
 * is the machanism to achieve abstraction 
 * 
 * abstraction of muliple inheritance will be achieved by the interface 
 *
 * is-A relationship like inheritance 
 * 
 * field inside interface pubic static final as default 
 * 
 * method inside interface public abstract for default;  
 * 
 *  
 * */
interface CricketRole{
    int min =5;
    void bowler();

    void batsman();

    private void allrounder(){
        System.out.println("this is the allrounder");
    };
    default void locally(){
        allrounder();
    }
    default void name(){
        System.out.println("name");
    }

}
interface Cricketer {

    void a();

    default void b(){
        System.out.println("default:this is the b method");
    }

    static void c(){
        System.out.println("static: this is the c method ");
    };
    
}


abstract class ashwin implements Cricketer,CricketRole{
@Override
public void a() {
    System.out.println("This is a a _ method");
}

@Override
public void bowler() {
    System.out.println("iam the bowler");
}

// @Override
// public void allrounder() {
//     System.out.println("iam a allrounder ");
// }

@Override
public void batsman() {
    System.out.println("iam the batsman");
}

}
public class a_3 extends ashwin {
    public static void main(String[] args) {
        Cricketer.c();//static method in interface 
        //    
        Cricketer c = new a_3();
        getRun(c);

        System.out.println(CricketRole.min);

    }

    public static void getRun(Cricketer c){
        a_3 obj = (a_3) c;
        obj.b();

        obj.locally();
    

    // public static 
}


}