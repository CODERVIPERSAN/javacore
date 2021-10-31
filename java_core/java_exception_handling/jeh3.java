package java_core.java_exception_handling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class jeh3 {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            method();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
    public static void method() throws IOException{
        
        FileReader file = new FileReader("javatpoint/java_core/java_exception_handling/aaa.txt");
        BufferedReader br = new BufferedReader(file);
        // String whole = br.readLine();
        // System.out.println(whole);
        // String wh = br.readLine();
        // Syst/em.out.println(wh);
        ArrayList <String> al = new ArrayList<String>();
        String value = br.readLine();
        while(value!=null){
            al.add(value);
            value = br.readLine();
        
        }
        System.out.println(al);
        }
    
}
