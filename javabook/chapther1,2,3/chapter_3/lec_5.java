public class lec_5 {
    public static void main(String[] args) {
    int a =5;
    int b=10;
    a=func(5,10);
        
        System.out.println(a);
        a = a<<24;
        a=a>>>23; //value of a is doubled 
        a=-a;
        //absolute value using thernery;
        a = a<0?-a:a;
        System.out.println(a);


//////////////////////////////////////////////////////////


    }
    public static int  func(int a,int b){

            
        while (b!=0){
        int sum = a^b;
        int carry = (a&b)<<1;
        a = sum ;
        b= carry;
        }
        return a;
    }

    
    
    
}
