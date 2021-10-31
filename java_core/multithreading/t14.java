package java_core.multithreading;

// import chapter_10.lib;

// import lib.lib;

public class t14 {
    public static void main(String[] args) {
       Runtime run =  Runtime.getRuntime();
       int pro = run.availableProcessors();
       lib.print();
        System.out.print(pro);
        lib.print();
        
        long fm = run.freeMemory();
        long um = run.totalMemory();
        System.out.print(um);
        lib.print();
        System.out.print(fm);
        lib.print();

    }
    
}
