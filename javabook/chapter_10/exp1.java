package chapter_10;

// import lib.lib;

class Inner {
    static int d;
    static void sub(){
        int a = 10/d;
        System.out.print(a);
    }

    
}

//exceptional handling ;

public class exp1 {
    public static void main(String[] args) {
    boolean end = false;
    while(!(end)){

    
        try{
            Inner.d = 0;
            Inner.sub();
            // throw new NullPointerException();
        }
        catch (ArithmeticException a) {
            // System.out.print("change d value");
         if(Inner.d==0){
            Inner.d=5;
            end = true;
         }
        
        }
        catch(NullPointerException e){
            System.out.print("trowing exciplity");
        
        }
        
        
    
    }
    lib.print();
    Inner.sub();
    lib.print();
    lib.print();
    
}
}
