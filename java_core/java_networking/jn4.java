package java_core.java_networking;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class jn4 {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.javatpoint.com/java-tutorial");
            
            try {
                URLConnection urlc = url.openConnection(); //to make connection
                InputStream value = urlc.getInputStream(); //to make input stream;
            System.out.println((char)value.read());
            } catch (IOException e) {
                
                e.printStackTrace();
            }
        
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


    
}
