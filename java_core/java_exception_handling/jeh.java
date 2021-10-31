package java_core.java_exception_handling;

/**
 * jeh
 */
public class jeh {

    public static void main(String[] args) {
      try{
       test();
    }
    catch(AException e ){
        System.out.println(e);
    }
        
    }

    public static void test(){
        try {
            int data =100/0;    
        } catch (ArithmeticException e) {
            throw new AException();
        }
    }
}


class AException extends ArithmeticException{
    @Override
    public String toString() {
        return "Infinity";
    }
}