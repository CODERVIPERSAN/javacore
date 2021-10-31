package polymorphism;
//method with String[]args will be invoked by jvm machine ;

import lib.lib;

public class main_method {
    public static void main(String[] args) {
        lib.print();
        System.out.print("String[]args");
        lib.print();
        
    }
    public static void main(){
        System.out.print("main method without parameter");
    }
    
}
