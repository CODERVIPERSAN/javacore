package chapter_8;

abstract class Fig{

    double dim1;
    double dim2;
    //getarea
    //abstract 
    Fig(double dim1,double dim2){
        this.dim1=dim1;
        this.dim2 = dim2;        
    }
    abstract double area();

    //concrete method
    public String welcome_add(){
        return "WElcome to our demo";
    }
}

/**
 * 
 */
 class rectangle extends Fig {
    rectangle(double dim1,double dim2){
        super(dim1,dim2);
    }
    double area(){
        return this.dim1*this.dim2; 
    } 
}

class triangle extends Fig{
    triangle(double dim1,double dim2){
        super(dim1, dim2);
    }
    double area(){
        return 0.5*this.dim1*this.dim2;
    }

}




public class absclass {
    public static void main(String[] args) {
        Fig f;
        
        f = new rectangle(2,3);
        System.out.print(f.area()); 
        f= new triangle(4, 5);
        System.out.print(f.welcome_add());
        System.out.println(f.area());

    
    }
    
}
//final is preventing from overridding
// final class fixed{

// }

// class fixedint extends fixed{
//error
// }

