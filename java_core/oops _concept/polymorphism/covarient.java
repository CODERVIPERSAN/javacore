package polymorphism;

// method_overriding methods of return type should have same singnature

//method overriding with return type of non primitive ,need no to be same signature

class A{
    A get(){
        System.out.print("inside A");
        return this;
    }

}

class B extends A{
    @Override
    A get() {
        System.out.print("inside B");
        return this;
    }
}
public class covarient {
    public static void main(String[] args) {
        // System.out.print(((B)new A()).get());
    //    without covarient 
        // var obja = new A();
        // obja.get();

        // var objb = new B();
        // ((B)objb).get();

        // with covarient

        var obja = new A();
        obja.get();
        var objb = new B();
        objb.get();
    }
    
}
