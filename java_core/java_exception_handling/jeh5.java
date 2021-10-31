package java_core.java_exception_handling;


//custom exception or user-defined exception

class AgeInvalidException extends Exception{
    String msg;
    public AgeInvalidException(String msg){
        super(msg);
        this.msg = msg;
    }
    @Override
    public String toString() {
        return msg;
    }

    

}



public class jeh5 {
    public static void main(String[] args) {
        try {
            validate(19);
        } catch (AgeInvalidException e) {
            System.out.println(e);
            System.out.println();
            System.out.println(e.getMessage());
        }
        
    }
    public static void validate(int age)throws AgeInvalidException{
        if(age<18){
            throw new AgeInvalidException("Your age is invalid to vote");
        }else{
            System.out.println("you are elligible to vote");
            System.out.println("welcome to voting section");
        }
    }
    
}


//to check eligiblity if not then throw the exception


