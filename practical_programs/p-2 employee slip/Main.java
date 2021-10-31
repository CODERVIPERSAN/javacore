import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        staffs programmer = new staffs();
        programmer.bp=1_00_000;

        staffs assistant_professor = new staffs();
        assistant_professor.bp=1_20_000;

        staffs associate_professor = new staffs();
        associate_professor.bp=1_00_000;

        staffs professor = new staffs();
        professor.bp =1_50_000;

        System.out.println("1.programmer");
        System.out.println("2.assistant professor ");
        System.out.println("3.Associate professor ");
        System.out.println("4.professor ");
        System.out.print("please enter your choice ");
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                programmer.name = sc.next();
                programmer.final_slip();
                programmer.sal_calc(programmer.bp);
            
                break;
            case 2:
                assistant_professor.name = "mahendran";
                assistant_professor.id =123;
                assistant_professor.mail_address="mahi@gmail.com";
                assistant_professor.address="thiruchi ";
                assistant_professor.mobile_no=472874723;
                assistant_professor.final_slip();

                assistant_professor.sal_calc(assistant_professor.bp);
            
            break;
            case 3:
                associate_professor.sal_calc(associate_professor.bp);
            break;
            case 4:
                professor.sal_calc(professor.bp);
            break;
                
        }
     
    }
    
}
