package java_core.java_String;
//to check the performs of STringBuffer and StringBuilder

public class p_test {
public static void main(String[] args) {
    long startTime = System.currentTimeMillis();
    //StringBuffer class instantiation
    StringBuffer sb = new StringBuffer("Hello");
    for (int i = 0; i < 10000; i++) {
        sb.append(" Java");
    }
    System.out.println("Time taken by StringBuffer "+(System.currentTimeMillis()-startTime));

    startTime = System.currentTimeMillis();
    StringBuilder s1 = new StringBuilder("hlo ");
    for (int i = 0; i < 10000; i++) {
        s1.append("Java");
    }
    System.out.println("Time take by StringBuilder "+(System.currentTimeMillis()-startTime));
    
}    
}
