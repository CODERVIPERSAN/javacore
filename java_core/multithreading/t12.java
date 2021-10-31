package java_core.multithreading;

class simple{
    int i;
}

public class t12 {
    public static void main(String[] args) {
        simple s1 = new simple();
        simple s2 = new simple();

        s1.i=10;
        s2.i=20;
        System.out.print(s1.i);
        System.out.print(s2.i);

        s1=s2;
        s2.i=30;
        System.out.print(s1.i);
    }
    
}
