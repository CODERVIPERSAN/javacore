package java_core.oops_concept
//static import 
import static java.lang.System.out;
public class e_1 {
    private String name;



    public static void main(String[] args) {
        //static import feature;
        e_1 f1 = new e_1();
        f1.setName("santhosh");
        out.println(f1.getName());
        out.println("hello world");

    }



    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }
    
}
