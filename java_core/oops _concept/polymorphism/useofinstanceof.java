package polymorphism;

// import org.graalvm.compiler.nodes.Invoke;

interface inter {

}

class Aa implements inter{


    public void a() {
    System.out.print("a method");    
    }
}

class Bb implements inter{
    
    public void b() {
        System.out.print("b method");
    }
}

class Call{
    static  void invoke(inter i )//upcasted
    {
        if(i instanceof Aa){
            Aa a = (Aa)i;//downcasted 

            a.a();
            
        }else if(i instanceof Bb){

            Bb b = (Bb)i;
            b.b();
        }
    }
}

public class useofinstanceof {

    public static void main(String[] args) {
        //assume ur object is bb;

        inter i = new Bb();
        Call.invoke(i);
        
    }
}
