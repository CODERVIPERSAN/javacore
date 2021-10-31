package java_core.java_inner_classes;

abstract class Person{
    abstract void eat();
    abstract void ate();
}


public class jic1 {
    public static void main(String[] args) {
        Person p = new Person(){
            void eat(){
                System.out.println("nice fruits");
            }

            void ate(){
                System.out.println("ate fruits");
            }
        };
        p.eat();
        p.ate();
    }

}
