package java_object_class;


// import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;






public class creating_obj1{
    String name = "santhosh";
  
    
    public static void main(String[] args) {
    
        // creating object 

        //loads the class
        try{

            // Constructor<creating_obj1> obj =;
            
            creating_obj1 obj1 =  creating_obj1.class.getConstructor().newInstance();
        
            
            System.out.print(obj1.name);
            
        }
        catch(NoSuchMethodException e){
            System.out.print(e);
        }
        // catch(ClassNotFoundException e){
        //     // e.printStackTrace();
        //     System.out.print("hello");
        // }
        catch(InvocationTargetException e){
            e.printStackTrace();
        }
        catch(InstantiationException e){
            e.printStackTrace();
        }catch(IllegalAccessException e){
            e.printStackTrace();
        }

        
    


        //
        
    }
    
}
