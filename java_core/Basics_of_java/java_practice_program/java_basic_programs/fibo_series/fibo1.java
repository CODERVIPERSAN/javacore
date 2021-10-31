package java_core.Basics_of_java.java_practice_program.java_basic_programs.fibo_series;
//without using recursion

public class fibo1 {
    public static void main(String[] args) {
        int n1=0,n2=1,n3,count=10;

        for (int i = 0; i <=count; i++) {
            if(i==0){
                System.out.print(0+" ");
                continue;
            }
            else if(i==1){
                System.out.print(1+" ");
                continue;
            }
            n3=n1+n2;
            System.out.print(n3+" ");
            n1=n2;
            n2=n3;
        }

    }
    
}
