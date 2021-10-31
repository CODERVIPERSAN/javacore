package revision;

import revision.ThreadOperation.Cube;
import revision.ThreadOperation.RandomNum;

/**
 * class file_1
 * three thread 
 * 
 * one compute random number ,
 * two compute square ,
 * three compute cube, 
**/
interface ThreadOperation{
    /**
     * square
     */
    class Square extends Thread{
        public int square(int value){
            // int value = RandomNum.getValue();
            return value*value;
        }

        public void run(){
            synchronized(this){
            int value = RandomNum.getValue();
            System.out.println("Square "+square(value));
        }
        }

        
        
    }

    class Cube extends Thread{
        // Cube(Thread t){
        //     if(t instanceof RandomNum ){
        //         t.start();
                
        //     }
        // }
        public int   cube(int value){
            // int value = RandomNum.getValue();
             return (value*value*value);
        }
        @Override
        public void run(){
            int value = RandomNum.getValue();
            System.out.println(cube(value));
        }
    }

    class RandomNum extends  Thread{
        static int value ;
        @Override
        public void run() {
            synchronized(this){
                double value1 = Math.random()*10;
                value = (int)value1;
                // System.out.println(value);
                

            }
        }
        public  static  int  getValue(){
            return value;
        }
    }
}




public class File_1 {
    public static void main(String[] args) {
       var  randNo =  new ThreadOperation.RandomNum();
        
       randNo.start();

       int value = RandomNum.getValue();
       Thread t ;
       if(value%2==0){
            t = new ThreadOperation.Cube();
            t.start();
       }
       else {
           
           t = new ThreadOperation.Square();
           t.start();
       }



    //    if(value%2==0){ new ThreadOperation.Cube().start();}
    //    else{ new ThreadOperation.Square().start(); }



        
    }
    
}
