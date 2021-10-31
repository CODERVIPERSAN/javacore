
//lets talk breifly about constructor and static
//variable 

/**
 * emp
 */
class emp {
    int key;
    String name;
    static String manager="ramakrishnan";


    public boolean  iselligible(int a){
    
        System.out.println(a);
        
        if (a>=65) {
            return true;
            
        } else {
            return false;
            
        }

        
    }

// static{
    
//     String boss ="ramakrishnan";

// }
//or static String work_assigned 
}


public class static1 {
    public static void main(String[] args) {
        emp worker = new emp();
        worker.key=70;
        boolean response = worker.iselligible(worker.key);
        System.out.println(response);
        if (response) {
            System.out.println("please prize this employee"+worker.name+"he have completed the work given by"+emp.manager);
        
        //static variable is independent of object name 
        //static block canbe used for the this 
        //or simply using static infront of datatype make the value static 

        }
        else{
            System.out.println("Sry you are not elligiblle");
        }
    }
}
