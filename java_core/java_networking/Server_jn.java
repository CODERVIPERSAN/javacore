package java_core.java_networking;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

// Socket programming is the communication between the
// application in the different jre

//two claases is used socket and server socket -->
//socket is by the client and server socket is my the server to accept

//socket is the endpoint between the server and client 
public class Server_jn {
    public static void main(String[] args) {

        try {
            ServerSocket ss = new ServerSocket(6666);
            Socket s = ss.accept();
            DataInputStream dis = new DataInputStream(s.getInputStream());
            String message = (String) dis.readUTF();

            System.out.println("message :"+message);
            ss.close();
            // ss.accept();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    
}


