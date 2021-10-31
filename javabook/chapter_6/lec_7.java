package chapter_6;
import java.util.Scanner;
// import lib.lib;


/**
 * Box/ 
 */
 class Box  {
    float width;
    float height;
    float depth;
    float side;
    int score =0;
    float volume;

    Box(float width,float height,float depth){
       this.depth = depth;
       this.volume =  this.volume(width,height,depth);
      
    }
    Box(float side){
        this.side = side;
        this.volume =  this.volume(side);
       
     }
     Box(){
         Scanner ch = new Scanner(System.in);
         lib.printf("side --- ");
         width = ch.nextFloat();
         this.volume = this.volume(width);
         ch.close();

         
         
     }

    float volume(float width,float height,float depth){
 return width*height*depth;
    }
    float volume(float side){
        return side*side*side;
    }
    protected void finalize(){
        System.out.print("this is the finalize block");
    }
    
}

public class lec_7 {
    public static void main(String[] args) {
        
        //creating a box object 
        //first instance of the class
        Box box = new Box(6);
        lib.print(box.volume);

        //second instance of the class
        Box box1 = new Box();
        lib.print(box1.volume);
        
        box =box1;
        box1.height=5;
        lib.print(box.volume);




    }
   
    
}
