package java_core.multithreading;

public class t13{  
    public void finalize(){System.out.println("object is garbage collected");}  
    public static void main(String args[]){  
     t13 s1=new t13();  
     t13 s2=new t13();  
     s1=null;  
     s2=null;  
     System.gc();  
    //  garbage collected
    }  
   } 
