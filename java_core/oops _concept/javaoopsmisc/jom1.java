package javaoopsmisc;
import static java.lang.System.out;

import java.io.PrintStream;
import java.lang.Object;

// import org.graalvm.compiler.nodes.GetObjectAddressNode;
class parent  {
    int i;
}

class child{
    int j;
}
//object class
public class jom1 {
    public static void main(String[] args) {
    Object  obj; //object reference from object class
    obj = new parent();//any class even parent class can be threated  as child of the object class;
    parent pa = (parent)obj;
    pa.i=10;
    PrintStream out = System.out;
    PrintStream out2 = out;
    out2.println(pa.i);
       out2.println(obj.getClass());
       out2.println(obj.hashCode());
       System.out.println();
       out2.println(obj.toString());
    //    obj.notify();
    //    obj.notifyAll();
       
    //    try {
    //     obj.wait(1000);
    //     obj.wait();
    // } catch (InterruptedException e) {
        
    //     // e.printStackTrace();
    // }
    
    
    
}
}