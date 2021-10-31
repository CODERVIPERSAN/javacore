package java_core.Basics_of_java;
import java.io.*;

// /**
//  * {@docRoot ./} 
//  * @author name - text
//  * {@code text} 
//  * @version version- text
//  * @since release
//  * @param parameter-name description
//  * @return description
//  * 
//  */

/**
 * <h2>max</h2> 
 * This program implements an application
 * to perform operation such as addition of numbers
 * and print the result
 *  
 * <b> Main class is b4  </b>
 * 
 * <h1> this program is from</h1>
 * 
 * @author Sandy
 * @version 33.0
 * @since 2024
 * 
 * 
 */


/**
 * This is the class of the main method use of sum() method
 * @main method where code starts
 * @param args Unused
 * @see typemismatch 
 * @see IOexception 
 */


public class b4 {
    
    
    public static void main(String[] args) {
        Max m = new Max();
        m.var1 = 10;
        m.var2 = 16;

        int value = m.max(10, 16);
        
        System.out.print(value);

    }
    
    
}

/**
 * Max
 * 
 * the class which provides the field for two variable 
 * 
 * and method max to calculate maximum
 * 
 * 
 * 
 */
class Max {
    /**
     * var1 is referenced provides the field for the variable in max  class
     */
    int var1;
    int var2;
    
    /**
     * this method calculates the max of the two field
     * @param input1 parameter one of the max method
     * @param input2 parameter two of the max method
     * 
     * @return int this returns the max of two input
     */
    public int max(int input1,int input2)
    {return (input1>input2)?input1:input2;}
    
}
