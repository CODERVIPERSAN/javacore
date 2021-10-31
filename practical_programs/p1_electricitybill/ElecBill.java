package practical_programs.p1_electricitybill;
public class ElecBill {
    
    String con_no,con_name;
    
    float pmr,cmr,s=0;
    
    float unit(){
        s= cmr-pmr;
        return s;
    }
    
    float domestic(float s){
        float amount=0;
        float temp=s;

        if(s<=100){
            amount+=1*s;
            return amount ;

        }else{
            s-=100;
            amount =100;
          
          
        }
        if(temp>=101 && temp <=200){
            amount += s*(float)2.5;
            return amount;
        }
        else{
            s-=100;
            amount += 100*(float)2.5;


        }
        if (temp>=201 && temp<=500) {
            amount += s*4;
            return amount;
            
        } else {
            s-=300;
            amount +=300*4;
            
        }
        if(temp>501){
            amount+=s*6;
            return amount;
        }
    
      return amount;
      
}
    void bil_format(){
        System.out.print("consumer number: ");
        System.out.println(con_no);

        System.out.print("consumer name");
        System.out.println(con_name);

        System.out.print("Enter the prev month reading: ");
        System.out.println(pmr);

        System.out.print("enter the current month reading: ");
        System.out.println(cmr);
        
        int length = con_no.length();
        if(length<=5){
            s=unit();
            System.out.print(s);
            float amount = domestic(s);
            System.out.print("your bill is ");
            System.out.println(amount);
        }
    }
}

