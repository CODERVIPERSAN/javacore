package java_core.java_exception_handling;

import java.io.IOException;

public class jeh4 {
    public static void main(String[] args) {
        



        try {
            simple1();
        } catch (IOException e) {
            System.out.println("this is the use of throws keyword");
        }
    }

    public static void simple1() throws IOException{
        func_name();
    }
    public static void func_name()throws IOException{
        throw new IOException();//compile time exception
    }
    
}
