package practical_programs.p4_;

public class stack1 {
    public static void main(String[] args) {
        int size =5;
        int []arr= new int[size];
        
        stack_implementation s1 = new stack_implementation(arr, size);
        System.out.println();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.push(76);
        s1.push(56);
        s1.pop();
        s1.pop();
        s1.printstack();

    }
    
}
