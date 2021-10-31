package java_core.Basics_of_java.java_practice_program.java_basic_programs.prime_number;

public class prime1 {
    public static void main(String[] args) {
        for (int i =100; i < 1000; i++) {
         if(isPrime(i)){
             checkPrime(i);
         }   
        }

    }

    public static void checkPrime(int n){
        System.out.print(isPrime(n));
        if(isPrime(n)){
            System.out.print(n+" "+"is the prime number\n");
        }else{
            System.out.println(n+" "+"is not a prime");
        }
    }

    public static boolean isPrime(int n){

        if(n==0||n==1||n%2==0){
            return false;
        }else if(n>=2){
            for (int i = 2; i <=n/2; i++) {
                if(n%i==0){
                    return false;
                }
            }
            return true;


        }else{
            System.out.print("invalid input false is returned");
            return false ;
        }

    }
    
}
