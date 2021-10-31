package java_core.java_networking;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class jn5 {
    public static void main(String[] args) {

        try {
            URL url = new URL("http://www.javatpoint.com/java-tutorial");
            try {
                HttpsURLConnection huc = (HttpsURLConnection) url.openConnection();
                for (int i = 0; i < 3; i++) {
                    // System.out.println();
                    System.out.println(huc.getHeaderFieldKey(i)+" "+huc.getHeaderField(i));
                }
                huc.disconnect();
                // huc.disconnect();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }

    
}
