package java_core.Basics_of_java.java_practice_program.java_basic_programs.fibo_series;

public class fibo2 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(fibo(i)+" ");     
        }
        
        
    }

    public static int  fibo(int var){
        if(var==0){
            return 0;
        }
        else if(var==1){
            return 1;
        }
    
        return fibo(var-2)+fibo(var-1);
        

    }
}
