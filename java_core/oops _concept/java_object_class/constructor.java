package java_object_class;

//called when instance of the class is created ;
//copy the value of one construct to other object 

//like copy construct in c++ 
    //using constructor mostly used 
    //outside the class without using constructor ---seldom used 
    //colning which is discussed int the creating_obj section

class Students{
    int id ;
    String name;

    Students(int id ,String name){
        this.id = id;
        this.name = name ;
    }
    Students(Students s){
        this.id = s.id;
        this.name = s.name;
    }
}


public class constructor {
    
    public static void main(String[] args) {
        Students std = new Students(20104064,"santhosh");
        Students std1 =new Students(std);
        System.out.print(std.name);
        System.out.print(std.id);
        std.name ="pragadeeswar";

        System.out.print(std1.name);
        System.out.println(std1.id);
    }

    


    
}
