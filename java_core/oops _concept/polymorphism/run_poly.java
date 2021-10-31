package polymorphism;
//upcasting 
// reference variable of parent class refers to child object then it is upcasting

//runtime polymorphism is unaffected by data field delared 
class A1{
    A1(){System.out.println("a class");}
}

class B1 extends A1{
    B1(){
        System.out.println("b class");
    }
}


public class run_poly {
    public static void main(String[] args) {
        A1 a;
        a = new B1();//upcasting 

    }
    
}
