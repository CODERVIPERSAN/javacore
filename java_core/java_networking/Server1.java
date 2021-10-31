package java_core.java_networking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {
    public static void main(String[] args) {
        while(true)
        try {
            ServerSocket ss = new ServerSocket(1111);
            Socket s = ss.accept();
            
            DataInputStream dis = new DataInputStream(s.getInputStream());
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            
            String value = (String)dis.readUTF();
            System.out.println("client1");
            System.out.println(value);
            value = new java.util.Scanner(System.in).nextLine();
            if (!(value.equals("stop"))) dos.writeUTF(value);
            else{
                dos.flush();
                dos.close();
                s.close();
                // System.exit();
            } 
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
    
    
}
