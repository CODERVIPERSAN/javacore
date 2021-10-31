package java_core.java_iostream;
import java.io.BufferedOutputStream;
import java .io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class jio4 {
    public static void main(String[] args) {
      try {
        OutputStream obj = new BufferedOutputStream(new FileOutputStream("jio4.txt"));
        String name = "santhosh";
        try {
            obj.write(name.getBytes());
            obj.flush();
            obj.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    } catch (FileNotFoundException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
      
      
        
    }




    
}

//same for the buffered output stream 
//buffered is faster than normal input and output file stream

