// Local innerClass class is created inside  the method
package java_core.java_inner_classes;


public class jic2 {
    private int data =30;
    void display(){
        class Local{
            void msg(){System.out.println(data);}
        }
        Local l = new Local();
        l.msg();
    }
    
    
    public static void main(String[] args) {
        var obj = new jic2();
        obj.display();
    }



}
