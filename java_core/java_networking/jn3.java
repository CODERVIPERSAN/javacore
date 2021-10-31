package java_core.java_networking;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

public class jn3 {
    public static void main(String[] args)  {
        
   try {
    URL url = new  URL("https://www.javatpoint.com/URL-class");
    var path = url.getPath();

    try {
        var tourl   = url.toURI();
        var host    = url.getHost();
        var port    = url.getPort();

        System.out.println(tourl+" "+host+" "+port);
     url=new URL("https://www.google.com/search?q=javatpoint&oq=javatpoint&sourceid=chrome&ie=UTF-8");    
    
System.out.println("Protocol: "+url.getProtocol());    
System.out.println("Host Name: "+url.getHost());    
System.out.println("Port Number: "+url.getPort());    
System.out.println("Default Port Number: "+url.getDefaultPort());    
System.out.println("Query String: "+url.getQuery());    
System.out.println("Path: "+url.getPath());    
System.out.println("File: "+url.getFile());   
    } catch (URISyntaxException e) {

        e.printStackTrace();
    }


} catch (MalformedURLException e) {
    
    e.printStackTrace();
}

    }



    

    
    
}
