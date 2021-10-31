
public class Employee {
    String name;
    int id;
    String address;
    String mail_address;
    long mobile_no;
   

    public void sal_calc(float bp) {

        float gross,net,da,hra,pf,cf;
        da =(float)0.97*bp;
        hra = (float)0.1*bp;
        pf =(float)0.12*bp;
        cf =(float)0.001*bp;
        gross =(float) bp+da+hra;
        net = (float)gross-pf-cf;

        System.out.println("The gross salary" + gross);
        System.out.println("The net  salary"+ net);

        
    }
    void final_slip(){
        
        System.out.println("////////////////////////");
        System.out.println();
        
        System.out.print("name of the employee:  ");
        System.out.println(name);
        System.out.println()

        ;System.out.print("id of the employee  ");
        System.out.println(id);
        System.out.println();
        
        System.out.print("address of the employee  ");
        System.out.println(address);

        System.out.print("mobile  ");
        System.out.println(mobile_no);
        System.out.println();
        System.out.print("mail address  ");
        System.out.println(mail_address);
        System.out.println();
        System.out.println();



    }

   
}


//use of interitance 
 class staffs extends Employee{
    float bp;
    

}   




