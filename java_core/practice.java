package java_core;

public class practice {

practice(int v){
    System.out.println("parent");
    System.out.println(v);
}    
    void run(){
        System.out.println("run");
    }
}

/**
 * Innerma*/
 class Innermain extends practice {
     Innermain(){
        super(5); 
         
     }
     {  
         System.out.println("child");}
    void run(){
        System.out.println("childclass running"); 
    }
}

    class Innermain1 extends practice {
        Innermain1(){
           super(5); 
            
        }
        
            {System.out.println("child");}
       void run(){
           System.out.println("child1class running"); 
       }
    }
    class simple{
    public static void main(String[] args) {
        practice i = new Innermain();
        //to run bassed on object 
        runner(i);
    }
    public static void  runner(practice obj){
        if(obj instanceof Innermain1 ){
            obj = (Innermain1)obj;
            obj.run();
        }
        // else if(obj instanceof practice ){
        //      obj = (Innermain)obj;
        //     obj.run();
        else if (obj instanceof Innermain ){
            obj = (Innermain)obj;
            obj.run();
        }
    } 
}  


