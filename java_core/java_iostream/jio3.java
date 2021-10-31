package java_core.java_iostream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class jio3 {
    public static void main(String[] args) {
        String name ="this is the string of bytes";
        byte[] arr = name.getBytes();
        
        try {
            FileOutputStream fos = new FileOutputStream("jio3.txt");
            try {
                fos.write(arr);
                fos.close();
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
