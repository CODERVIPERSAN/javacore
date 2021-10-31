package java_core.java_String;
import java.util.Scanner;
import java.util.StringTokenizer;
// import ;
//String tokenizer class
public class js3 {
    public static void main(String[] args) {
        StringTokenizer sT = new StringTokenizer("|my |name |is |khan|");
        while (sT.hasMoreTokens()) {
            System.out.println(sT.nextToken("|"));
            System.out.println("st.token "+sT.countTokens());
        }        
       
        String str = " this is javatpoint";
        StringBuffer sb = new StringBuffer(str);
        sb = sb.reverse();

        System.out.println(sb);
    //palindrome in java 
        Boolean ispali = false;
        System.out.println("enter the string to check");
        String value = (new Scanner(System.in)).nextLine();
        String reverse = String.valueOf(new StringBuilder(value).reverse());
        System.out.println(value);
        System.out.println(reverse);
        ispali  = value.equals(reverse);
    
        if(ispali){
        System.out.println("this is the palindrome");
    }else{
        System.out.println("this is not the palindrome");
    }
    System.out.println(capitalize(value));
    System.out.println(reverse_word(value));

    }

    public static String capitalize(String str){
        StringTokenizer sT = new StringTokenizer(str);
        String str1 = " ";
        while(sT.countTokens()!=0){
            String temp = sT.nextToken();
            temp = temp.substring(0,1).toUpperCase()+temp.substring(1,temp.length())+" ";
            str1+=temp;
        }
        return str1;

    }
    public static String reverse_word(String str){
        StringTokenizer sT = new StringTokenizer(str);
        String str1 = " ";
        while(sT.countTokens()!=0){
            String temp = sT.nextToken();
            StringBuilder sb = new StringBuilder(temp);
            str1+=" "+sb.reverse();
        }
        return str1;

    }
}
