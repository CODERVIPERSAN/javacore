package java_core.java_misc;

import java.util.Arrays;

public class arr1 {
    public static void main(String[] args) {
        int[]arr = (new int[]{1,2,3,4,5}).clone();//clonning the array 
        System.out.println(Arrays.toString(arr));//display with toString
        Class cls = arr.getClass();
        String name = cls.getName();
        System.out.println(name);
        System.out.println(cls);

    }
    
}

class clone_sample implements Cloneable{
    int i;
    int j;
    {
        i=12;
        j=90;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
/**
 * Innerarr1
 */
class Innerarr1 {
    public static void main(String[] args) throws CloneNotSupportedException {
        clone_sample s1 = new clone_sample();
         clone_sample s2 = (clone_sample)s1.clone();
            System.out.println(s1.i);
            System.out.println(s2.i);
        }
    
}
