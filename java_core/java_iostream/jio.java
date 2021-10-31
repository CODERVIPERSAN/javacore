package java_core.java_iostream;

import java.io.IOException;

public class jio {
    
    public static void main(String[] args) throws IOException {
        
        System.out.println("this is the stream function");

        System.err.println("error message");

        // System.out.println
        int i = System.in.read();
        System.out.println((char)i);

    }


    
    
}
