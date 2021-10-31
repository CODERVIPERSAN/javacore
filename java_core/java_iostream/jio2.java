package java_core.java_iostream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//using file output stream print alaphabets in a file
public class jio2 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("newfile.txt");
            try {
                for (int i = 65; i <=89 ; i++) {
                    fos.write(i);
                }
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
