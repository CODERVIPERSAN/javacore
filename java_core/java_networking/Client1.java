package java_core.java_networking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client1 {
    public static void main(String[] args) {
        while (true) {
            
        
        try {
            Socket client = new Socket("localhost",1111);
           DataOutputStream dos = new DataOutputStream(client.getOutputStream());
           DataInputStream dis = new DataInputStream(client.getInputStream());
           
           dos.writeUTF(new Scanner(System.in).nextLine()); 

           String mess = (String)dis.readUTF();
            System.out.println("client2:");

            System.out.println(mess);

           
        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
        
    }
    
}
