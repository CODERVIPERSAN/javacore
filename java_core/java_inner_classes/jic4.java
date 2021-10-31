package java_core.java_inner_classes;


/**
 * Innerjic4
 
 int*/
 interface Innerjic4 {
    void show();

    interface Innerjic4_1 {
    void msg();

    }
}
public class jic4 implements Innerjic4.Innerjic4_1{
    public static void main(String[] args) {
            Innerjic4.Innerjic4_1 obj = new jic4();
            obj.msg();
    }

    @Override
    public void msg() {
        System.out.println("Hello nested interface");
    }
    
}
