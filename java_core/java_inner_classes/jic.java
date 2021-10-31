package java_core.java_inner_classes;

public class jic {
    public static void main(String[] args) {
        var obj = new Outer().new Inner();        
        obj.msg();
        // System.out.println(new Outer().hashCode());
        
    }
    
}

class Outer{
    private int data;
    { data=10;}
    void msg(){System.out.println("message is printed");}
    class Inner{
        void msg(){System.out.println("message is printed in inner class");}
    }//non static class
}


