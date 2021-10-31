
package inheritance;
import polymorphism.method_overriding;

//inheritance program for finding circle area;

class Operation{
    //mathematical operation methods
    double  square(double  r){
        return r*r;
    }
}

class Circle extends Operation{
    
    //area method
    double area(double radius){
        return Math.PI*square(radius);
        
    }
    //factory method ;
    public static  Circle getCircleInstance(){
        return new Circle();
    }


}
class pro_test extends method_overriding{
    
    public static void protest(){
        new pro_test().testing();
    }
    
}

interface myInt{
    int add(int a,int b);
}



public class i_1 {
    public static void main(String[] args) {
        
        var c1 = Circle.getCircleInstance();
        // var c2 = new Circle();
        var a =10;
        // var a1 ="string ";
        

        System.out.print(a);
        System.out.print(c1.area(10));

        myInt obj = (a2,b) -> (a2+b);
        System.out.println();
        System.out.print(obj.add(1,2));

        pro_test.protest();
        
    }
    
}
