package java_core.java_String;
//CharSequence ,//Serializable,//Comparable

import java.text.Format;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class js1 {
    public static void main(String[] args) {
        char []ch ={'j','a','v','a',};
        String str = new String(ch);
        System.out.println(str);
        //or 
         str = "java";
        System.out.println(str);
        //or
         str = new String("java");
        System.out.println(str);

        //concat

        String j = "java";
        j = j.concat("thon");
        System.out.println(j);


        //String comparsion in java 
        //          By Using equals() Method
        //          By Using == Operator
        //          By compareTo() Method
        String s1 ;
        String s2;
        s1="java";
        s2="JAVA";
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        //String concatenation

        // concate1
        String x = "Sachin";
        String y ="Tendulukar";
        String str1 = "Sachin"+"Tendulkar";
        System.out.println(str1);
        //or same as declaring 
        String str2 = (new StringBuilder()).append("Sachine").append("Tendukar").toString();
        System.out.println(str2);
        //concate2
            //using concat method in java 
        //By using String builder class append method
            StringBuilder ch1 = new StringBuilder(x);
            StringBuilder ch2 = new StringBuilder(y);
            StringBuilder con = ch1.append(ch2);
            System.out.println(con+" String builder");

        //concate4
            //using string format method

            String s = String.format("%s%s",x,y);
            System.out.println(s+"  using format");

        //concate5
            //using join method

            String sb = String.join("",x,y);
            System.out.println(sb+"using join method");
        //concate6
            //using joinner class
            StringJoiner sj = new StringJoiner(",");
            sj.add(x);
            sj.add(y);

            System.out.println(sj+" using the joinner class");
        //concate7
            //using Collectors.joining();
            List<String> lis = Arrays.asList("ab","bc","cd");
            // Collertor cl = Collectors.joining(",");
            String st = lis.stream().collect(Collectors.joining(","));
            System.out.println(st);

            //array_list adding separate in it;

            List<Character> en = Arrays.asList('s','a','n')    ;
            System.out.println(en);

            String value = x.substring(0,4);
            System.out.println(value);
            String []arr = st.split("[\s]");
            st = st.replaceAll("\\W", "|");
            System.out.println(Arrays.toString(arr));
            System.out.println(st);
            boolean b = st.matches("|");
            System.out.println(b);

            x= x.toUpperCase();
            System.out.println(x);
            x= x.toLowerCase();
            System.out.println(x);
            System.out.println(x.startsWith("sa"));
            System.out.println(x.endsWith("n"));

            for(int i=0;i<x.length();i++){
                System.out.print(x.charAt(i)+"-");
            }

            System.out.println(x);
            String x1 ="Sachi";
            x1 = x.intern();
            System.out.println(x1);
            int an =10;
            String sa = String.valueOf(an);
            System.out.println(new StringBuilder(sa).append(new StringBuilder(sa)));
            String s11 = "Kava is a programming language .Kava is a independent of any platform";
            s11 = s11.replace("Kava", "Java");
            //replace or replaceAlll can be used 
            System.out.println(s11);

            
            StringBuffer name = new StringBuffer("name: ").append(new StringBuffer("Santhosh"));

            System.out.println(name);

            name = new StringBuffer("name: Ramakrishnan").insert(5,"Santhosh");
            System.out.println(name);

            name = name.reverse();
            System.out.println(name);
            System.out.println(name.capacity());
            //slicing 

            String na = name.substring(4,10);
            System.out.println(na);
            //Stringbuffer and Stringbuilder classes used for mutable String 

            
        



    }
    
}
