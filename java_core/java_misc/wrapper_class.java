package java_core.java_misc;

public class wrapper_class {
    public static void main(String[] args) {
    int a =10; //primitive type 
    Integer j = a;//autoboxing  
    //primitive to wrapper class
    //or
    Integer k = Integer.valueOf(a);

    int b = j; //unboxing
    //or 
    int c = j.intValue();//unboxing 
   
    System.out.println(j+" "+a+" "+k);

    javatpoint i = new javatpoint(10);
    System.out.println(i);

    }
    
}
class javatpoint{
    int i;
    javatpoint(int i)
    {
        this.i =i;
    }
    @Override
    public String toString() {
        return Integer.toString(i);
    }
}


