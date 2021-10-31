package java_core.Basics_of_java;
public class leap {
    public static void main(String[] args) {
        //Using ternary operator
        int year;
        System.out.print(year=1900);
        boolean isleap = (year%4==0)?((year%100==0)?((year%400==0)?true:false):true):false;
        System.out.print( isleap?"leap year":"not a leap year");
        
    }
    
}
