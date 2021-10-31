package java_core.Basics_of_java;
//java enum and switch statements

public class b2 {

    public static void main(String[] args) {
        for ( Day day :Day.values() ) {
            switch (day) {
                case sun:
                    System.out.println("sunday");
                    break;
                case mon:
                    System.out.println("monday");
                    break;
                            
                default:
                    break;
            }
        } 

    }

    public enum Day{
        sun,mon,tues,wed,thurs,fri,sat
    }
    
}
