package chapter_8;

//method overriding
public class runtime_poly {
    public static void main(String[] args) {
    
        Figure r ;
        rect re = new rect(4,3);
        r=re;
        r.area();
        r= new tri(2,3);
        r.area();
        r= new Figure(5,6);
        r.area();

       

    }
}
    
    /**
 * Innerruntime_poly
 */
 class Figure {
    double dim1;
    double dim2;
    Figure(double dim1,double dim2){
        this.dim1 = dim1;
        this.dim2 = dim2;

    }
    double area(){
        System.out.print("invalid we cant find area");
    return 0;
    }
}


class rect extends Figure {
rect(double len,double bre){
    super(len,bre);

}

 double area(){
    System.out.println("area "+ dim2*dim1);
    return 0;
}

    
}

class tri extends Figure{
    tri(double len,double bre){
        super(len,bre);
    }
    double   area(){
        System.out.println("area"+ 0.5*dim1*dim2);
    return 0;
    }
}


