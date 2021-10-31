package java_object_class;

import lib.lib;

public class creating_obj2 implements Cloneable {
    String name;
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        
        creating_obj2 obj1 = new creating_obj2();

        obj1.name = "name1";
        try {
            var clone = obj1.clone();
            creating_obj2 obj2 = (creating_obj2)clone;//downcasting left side child class refernece
            
            System.out.print(obj2.name);
            
            obj1.name ="10";
            System.out.print(obj1.name);

            System.out.println(obj2.name);

            lib.print();
            lib.print();
            System.out.print(new creating_obj2().name="santhosh"); 
       
        } catch (CloneNotSupportedException e) {
            System.out.print(e);
        }


    }
    
}
