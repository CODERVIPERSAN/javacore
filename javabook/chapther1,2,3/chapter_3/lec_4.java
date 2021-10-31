// lec_4 is to now to intialize array and how to access the array 
public class lec_4 {
    public static void main(String[] args) {
        // int var[];   //declaration
        // var = new int[10]; //allocation
        int [] var = new int[10];
    
        for(int i=0;i<9;i++){
            var[i]=i;
        }
        for(int i=0;i<10;i++){
            System.out.println(var[i]);
        }
        String str="this is the end of the program";
        System.out.println(str);
    }
    
}
