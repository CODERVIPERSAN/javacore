package java_core.java_networking;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client_jn {

    public static void main(String[] args) {
        try {
            Socket client = new Socket("localhost",6666);
            DataOutputStream dos = new DataOutputStream(client.getOutputStream());
            // while (true) {
                
            String value =(new java.util.Scanner(System.in)).nextLine();
            dos.writeUTF(value);
            dos.flush();
            dos.close();
        
            client.close();
        
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
}
