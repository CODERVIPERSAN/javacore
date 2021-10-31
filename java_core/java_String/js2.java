package java_core.java_String;
//to string 
    //print(obj)  it going to give the & of obj hash value 
    //obj  should print(details of the obj)
    //to achieve this we should override the toString method 

class superb{
    int rollno;
    String name;
    String city;
    {
        this.rollno =18;
        this.name ="Santhosh";
        this.city = "coimbatore";

    }

    @Override
    public String toString() {
        return String.valueOf(new StringBuilder("[").append(String.valueOf(rollno+",")).append(name+",").append(city).append("]")) ;
    

    }

}


public class js2 {
    public static void main(String[] args) {
    superb sub = new superb();

    System.out.println(sub.toString());
    //or
    System.out.println(sub);

    

    }
    
    
}
