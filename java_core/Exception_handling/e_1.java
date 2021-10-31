package java_core.Exception_handling;

import java.io.FileNotFoundException;
import java.io.IOException;

// import java.io.IOException;
// parent method of the throwable class
//Div by0Exception is the user defined parent class 
// this is like Exception class

class DivBy0Exception extends Exception{
    @Override
    public String toString() {
        return "divbyzeroexception";
    }
}


 class mess{//parent method not throwing any exception
    
    int  msg() {
        System.out.println("parent method");
        return 0;
    }

}

//child class may or maynot throw exception if it throw
// it throws runtime exception
public class e_1 extends mess {
    int a=10;
    int b=0;
    @Override
    public  int msg() throws ArithmeticException {
        System.out.print("mess is overrided by subclass");
       
        if(b==0){
            throw new ArithmeticException();
        }else{
            var vari= a/b;
            return vari;
        }
    }
    


    public static void main(String[] args) {
        mess p = new e_1();
        // try {
            try {
                p.msg();
            } catch (ArithmeticException e) {
              e_1 pi =  new e_1();
                pi.a=10;
                pi.b=20;
                pi.msg();
            }
        // } catch (Exception e) {
        //    System.out.print("catch block");     
        // }
        
    }
    
}
