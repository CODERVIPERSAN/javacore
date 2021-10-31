package chapter_5;
// import 

public class lec_6{
   public static void main(String[] args) {
    float value = lib.hypo(12,5);
    //or static way right_triangle.hypo(12,5);
    lib.print(value);
///////////////////////////////////////////////////////
//control statements
    int a =200;
    int b =300;
    while(++a<--b);
    lib.print();
    lib.print();
    
    lib.printf("this is the mid_point ");
    lib.printf(a);

    lib.print();
    lib.print();

    int []nums={1,3,5,6,8,9,0,10,2,96};
    // for eachloop
    for(int x:nums){
lib.print(x);
    }

// break label;
// goto label;
    outer:for(int i=0;i<10;i++){
     for(int j =0;j<=10;j++){
         lib.printf(j);
         if (j==10) break outer;

        }
    }

   
      
   }

  
}

   



