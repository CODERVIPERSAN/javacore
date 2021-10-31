package java_core.java_exception_handling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class jeh2 {
    public static void main(String[] args) {
        PrintWriter pw ;
        try {
            pw = new PrintWriter("/home/sandy/courses and college/oops java college course  3rdsem/java_progrms/javatpoint/java_core/java_exception_handling/aaa.txt");
            pw.append("this is the time to append");
            pw.append("finally appended this item in the file");
            pw.println("this is the time to wirte something ");
            pw.close();   
            new jeh2();
            
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }finally{
            System.gc();

        }
        System.out.println("file saved successfully");
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("object deleted");
    }
    
}


