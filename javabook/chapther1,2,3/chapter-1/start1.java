class employee{
int a;
int b;
String str;
    

    public void print() {
        System.out.print(a +" "+b+ " "+str);
        System.out.println("how checking is this the new line");
    }
}




public class start1 {
public static void main(String[] args) {
    //classname object ;
    //object = new classname()-->constructor
    employee worker = new employee();
    // this is the function call
    worker.print(); 

}
    
}