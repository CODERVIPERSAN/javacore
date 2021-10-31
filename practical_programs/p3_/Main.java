package practical_programs.p3_;
import java.util.Scanner;

import lib.lib;
import practical_programs.p3_.currency.currency;

public class Main {
    public static void main(String[] args) {
        
        lib.print("convertors");
        lib.print("1.distance");
        lib.print("2.currency");
        lib.print();
        System.out.print("enter your choice");
        
        switch (new Scanner(System.in).nextInt()) {
            case 1:lib.print("1.km to m ");
                   lib.print("2.m to km");
                   lib.print("3.m to miles");
                   lib.print("4.miles to m");
                   lib.print("5.km to miles");
                   lib.print("6.miles to km");
                    
                lib.print("enter your choice");
                lib.print();
                switch (new Scanner(System.in).nextInt()) {
                    case 1:
                        
                        break;
                    case 2:break;
                    case 3:break;
                    case 4:break;
                    case 5:break;
                    case 6:break;

                    default:
                        break;
                }
                break;
            case 2:
            lib.print("1.indian to dollar");
            lib.print("2.indian to yen");
            lib.print("3.indian to euro");
            lib.print("4.dolar to indian");
            lib.print("5.dollar to yen");
            lib.print("6.dollar to euro");
            lib.print("7.yen to indian");
            lib.print("8.yen to dollar");
            lib.print("9.yen to euro");
            lib.print("10.euro to indian");
            lib.print("11.euro to dollar");
            lib.print("12.euro to yen");
            lib.print();
            lib.print("enter your choice ");
            Scanner ch = new Scanner(System.in);
            switch (new Scanner(System.in).nextInt()) {
                
                case 1:
                 
                    System.out.print("enter the value ");
                    currency indian = new currency("i",ch.nextDouble());
                    
                    System.out.print("your dollar: "+indian.toDollar());
                    lib.print();
                    break;
            
                default:
                    break;
            }
            break;
            default:
                break;
        }
        


        
    }
    
}


// sandy@sandy:~/courses and college/oops java college course  3rdsem/java_progrms$  cd "/home/sandy/courses and college/oops java college course  3rdsem/java_progrms" ; /usr/bin/env /usr/lib/jvm/java-16-openjdk-amd64/bin/java --enable-preview -XX:+ShowCodeDetailsInExceptionMessages -Dfile.encoding=UTF-8 -cp /home/sandy/.config/Code/User/workspaceStorage/4af1cd2a71fdd7feaff7fb1f2ba6372d/redhat.java/jdt_ws/java_progrms_a1435b11/bin practical_programs.p3_.Main 
// convertors
// 1.distance
// 2.currency

// enter your choice2
// 1.indian to dollar
// 2.indian to yen
// 3.indian to euro
// 4.dolar to indian
// 5.dollar to yen
// 6.dollar to euro
// 7.yen to indian
// 8.yen to dollar
// 9.yen to euro
// 10.euro to indian
// 11.euro to dollar
// 12.euro to yen

// enter your choice 
// 1
// enter the value 10000
// your dollar: 135.72204125950054
