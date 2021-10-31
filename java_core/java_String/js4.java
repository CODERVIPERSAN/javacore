package java_core.java_String;

import java.io.UnsupportedEncodingException;
import java.text.ParsePosition;
import java.util.Arrays;

import javax.naming.Binding;

public class js4 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String name ="santhosh";
        // Stringtocharset method1
        char[]name_=new char[name.length()];
        name.getChars(0, name.length() , name_, 0);
        System.out.println(Arrays.toString(name_));
        //method2
        char []name_arr= new char[name.length()];
        for (int i=0;i<name.length();i++){
            name_arr[i]=name.charAt(i);
        }
        System.out.println(Arrays.toString(name_arr));
        int value = name.compareTo("");
        System.out.println(value);
        
        //defination of concat method implementtation
        String lname ="ramakrishnan";
        //increase the size of the array
        char[]buf = Arrays.copyOf(name_arr, name_arr.length+lname.length());
        System.out.println(buf);
        lname.getChars(0,lname.length(),buf,name_arr.length);
        System.out.println(new String(buf));  
        
        
        //contains

        Boolean bo = "santhosh".contains("san");
        System.out.println(bo);
        System.out.println("santhosh".indexOf("san"));
        int mathmark =100;
        Boolean pass = false;
        String fname = "santhosh";
        String lnam ="ramki";
        System.out.println(String.format("my name is %s %s and my  mark in maths is %d ,iam pass in exam is %b",fname,lnam,mathmark,pass));
        
        byte[] barr = fname.getBytes();
        System.out.println(Arrays.toString(barr));
        String nam = new String(barr);
        System.out.println(nam);

        char[] simple={'s','a','n'};

        String nami = new String(simple);
        System.out.println(nami);
        char[]charset=new char[fname.length()];
        fname.getChars(0,fname.length(),charset,0);
        System.out.println(Arrays.toString(charset));

        System.out.println(fname);

        byte[] bb = fname.getBytes("UTF-16");
        for (byte b : bb) {
            System.out.print(b);
        }
//  Binding binding = new Binding();
//  GroovyShell shell = new GroovyShell(binding);

        String name1 = new String("hello world").intern();
        String name2 = new String("hello world").intern();
        String name3 = name2;
        System.out.println(name3==name2);
        System.out.println(name1 == name2);

        String s1 = "Javatpoint";
        String s3 = new String("Javatpoint");
        String s2 = s1.intern();
        String s4 = s3.intern();
        System.out.println(String.format("%b %b %b %b %b %b", s1==s2,s1==s3,s1==s4,s2==s3,s2==s4,s3==s4));

        System.out.println(String.join("-", "welcome","javatpoint","is here")); 
        
        char[] charr = s1.toCharArray();
        System.out.println(Arrays.toString(charr));
        charr[7]='s';
        System.out.println(new String(charr));
        
        System.out.println(s3.toLowerCase());

        System.out.println(String.valueOf(charr[7]));

        
        
    }
    
    
}

/**
 * Innerjs4
 */
 class Innerjs4 {

    
}
