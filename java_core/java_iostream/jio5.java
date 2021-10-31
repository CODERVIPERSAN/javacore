package java_core.java_iostream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class jio5 {
    
    public static void main(String[] args) {
     
        try {
            FileInputStream fis = new FileInputStream("jio3.txt");
            try {
                int bin = fis.read();
                System.out.println((char)bin);
            } catch (IOException e) {

                e.printStackTrace();
            }
        
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        }

        
    }




    
}
