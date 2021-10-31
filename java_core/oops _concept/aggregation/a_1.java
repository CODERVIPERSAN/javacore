package aggregation;
//small program of inheritance can be solved with 
//aggregation

class Operation{
    double square(double  n){
        return n*n;
    }
    public static Operation getOperationInstant(){
        return new Operation();
    }
}
class Circle{
    Area area;

    public double  area(double radius){
        return Area.getAreaInstance().area(radius);
    }
    public static Circle getCircleInstant(){
        return new Circle();
    }

}

class Area {
    Operation op;
    double area (double radius){
        op = Operation.getOperationInstant();
        return Math.PI*op.square(radius);
    }

    public static Area getAreaInstance(){
        return new Area();
    } 

}



public class a_1 {
    public static void main(String[] args) {
    
        var cir1 = Circle.getCircleInstant();

        System.out.println(cir1.area(5)); 
        
        var cir2 = Circle.getCircleInstant();
        System.out.println(cir2.area(10));
    }
}

