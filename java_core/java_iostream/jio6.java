package java_core.java_iostream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class jio6 {
    public static void main(String[] args) {
        
        FileInputStream fis;
            try {
                fis = new FileInputStream("jio3.txt");
                try {int i;
                    if((i=fis.read())!=-1){
                            System.out.println((char)i);
                    }
                    
                    fis.close();
                } catch (IOException e) {
                    

                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                
            } catch (FileNotFoundException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
      

    }
    

}
