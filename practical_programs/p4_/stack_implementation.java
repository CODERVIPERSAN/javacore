package practical_programs.p4_;

// import practical_programs.p4_.stack_overflow;



public class stack_implementation implements stack_interface {
    int []arr;
    int size;
    int []arr1;
    int top ;
    int bottom;
    
    public stack_implementation(int[]arr,int size){
        this.arr =arr; 
        this.size = size;
        this.top = -1;
        this.bottom =-1; 
    }
    @Override
    public void push(int value){
        
        if(top==-1){
            
            arr[0]=value;
            top++;
            bottom++;
            // System.out.print("u");
            
        }
        else{
            // System.out.print("t");
            try{

            
                for (int i = bottom; i >=top; i--) {
                    arr[i+1]=arr[i];
                    
                }}
            catch(ArrayIndexOutOfBoundsException e){
                int [] arr1 = new int[2*size];
                for (int i=bottom;i>=top;i--){
                    arr1[i+1]=arr[i];
                }
                arr = arr1;
            }
            finally{
                arr[0]=value;
                bottom++; 
            }
                   
            
        }   
        
            
        
        
    }
    @Override
    public int pop() {
        if(arr.length==0){
            System.out.print("stack underflow");
            // throw new stack_underflow();
            
            
        }else{
            int data = arr[0];
            for (int i = top+1; i <= bottom; i++) {
                arr[i-1]=arr[i];
            }
            arr[bottom]=0;
            bottom--;
            return data;
        }
    return 0;
        
    }
    @Override
    public void printstack() {
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
class stack_underflow extends Exception{
    String des;
    public String toString(){
        System.out.print(des);
        return des;
    }
}