package practical_programs.p1_electricitybill;
import java.util.Scanner;
public class Eb {
 public static void main(String[] args) {
     ElecBill bill = new ElecBill();
     boolean end =false;
     while(!(end)){
     Scanner ch = new Scanner(System.in);

     System.out.print("Enter the consumer number ");
    bill.con_no = ch.nextLine();
     
    System.out.print("Enter the consumer name  ");
     bill.con_name = ch.nextLine(); 

     System.out.print("Enter the previous month reading "); 
     bill.pmr = ch.nextFloat();
     
     System.out.print("Enter the next month reading ");
     bill.cmr =ch.nextFloat();
    

     System.out.println("////////////////////////////////////////");
     System.out.println();
     System.out.println();
     System.out.println();
        
     
     bill.bil_format();


     System.out.println(); System.out.println(); System.out.println();
     
     
     System.out.println("/////////////////////////////////////////");
        ch.close();
     
     }
 
 
    }   
    
}



