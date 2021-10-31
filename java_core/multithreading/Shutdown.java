package java_core.multithreading;
// import java.io.IOException;
// public class Shutdown{
//     public static void main(String[] args) throws IOException {
//         Process shut_obj = Runtime.getRuntime();
//         shut_obj.exec("shutdown -s -t 0");

//     }
    
// }


import java.io.IOException;

// import lib.lib;

/**
 * Shutdown
 */
public class Shutdown {

    public static void main(String[] args) throws IOException {
        String os = System.getProperty("os.name");
        System.out.print(os); 

        if(os.equals("Linux")){
            System.out.print("working");
            Runtime run = Runtime.getRuntime();

            run.exec("shutdown -h -t0");
            System.exit(0);
        }else{
            System.out.print("invalid");
        }
    }
}

