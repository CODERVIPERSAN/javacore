package chapter_10;

class ValueException extends Exception{
    private String  detail;

    public String toString(){
        detail = ".Value error :your height or weight   is invalid!!";
        return detail;
    }
}

public class exp2 {
    public static void main(String[] args) {
    double value = height_weight(100,100);
    System.out.println();
    System.out.print("the bmi of the person "+ value);
    System.out.println();
}

    public static double height_weight(double height,double weight){

    

        
        if(!(height <200 && weight <200)){
            try{
                throw new ValueException();
            }
            catch (ValueException|ArrayIndexOutOfBoundsException e){
                System.out.print("descriptionP:"+e);
            }
        }else{
            double bmi = weight/(height*height) ;
            return bmi;
        }
        return 0;
    }
    
}
