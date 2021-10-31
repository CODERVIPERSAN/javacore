package polymorphism;

abstract class Bank{

    abstract int getRateOfInterest();
}

class ICIC extends Bank{
    @Override
    int getRateOfInterest() {
        return 5;
    }
    static ICIC getIccInstant(){
        return new ICIC();
    }
}

class Axis extends Bank{
    @Override
    int getRateOfInterest() {
        return 6
    ;}
    static Axis getAxisInstant(){
        return new Axis();
    } 
}

class Sbi  extends Bank{
    @Override
    int getRateOfInterest() {
        return 7;
    }
    static Sbi getSbiInstant(){
        return new Sbi();
    }
}


public class method_overriding {
    public static void main(String[] args) {
      
        // var as = Axis.getAxisInstant();
        // System.out.print(as.getRateOfInterest()); 
    
        method_overriding.getObject(1);
        
    
    }

    protected void testing (){
        System.out.print("testing protected");
        //access modifier;
    }

    public static void getObject(int value){

        switch (value) {
            case 1:
                Bank b1 =  new Axis();
                System.out.print(b1.getRateOfInterest()); 
                break;
            case 2:
                Bank b2 = new ICIC();

            break;
            case 3:
            

            Bank b3 =     new Sbi();
            break;
            
            }
    }
    
}
