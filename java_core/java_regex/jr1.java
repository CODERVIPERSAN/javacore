package java_core.java_regex;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class jr1 {
    public static void main(String[] args) {
    //1st method
    Pattern p = Pattern.compile(".s.");
    Matcher m = p.matcher("ast");
    boolean b = m.matches();
    
    boolean b1 = Pattern.compile(".s.").matcher("asy").matches();
    
    boolean b2 = Pattern.matches("..z", "asz");
    System.out.println(b1+" "+b2+" "+b);

    //. represent any character
    // ...math matches with sanmath

    // [a-z&&[^def]].*", is the regex 
    boolean test = Pattern.matches("[a-z&&[^def]]{3,}.*", "aaadOsh");
    System.out.println(test);
    //Regex Quantifiers
// *,+,?,{} quantifiers used for number of entiry
    
        //number of matches in the list 
        System.out.println("Enter the sentence ");
        String input = new Scanner(System.in).nextLine();
        System.out.println(input);
        String regex = "[a-z]*";
        System.out.println(regex);
        Pattern pat = Pattern.compile(regex);
        boolean isMactched = pat.matcher(input).find();
        ArrayList <String>list = new ArrayList<String>();
        while (pat.matcher(input).find()) {
            System.out.println("this is here ");
            list.add(pat.matcher(input).group()); 

        }

        Iterator it = list.iterator();
        System.out.println("List of matches");
        while (it.hasNext()) {
            System.out.println(it.next());
        }


}
    
}
