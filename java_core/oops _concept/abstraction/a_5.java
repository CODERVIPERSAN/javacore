package abstraction;
interface printable{
    void print();
}
interface Showable extends printable{
    void show();
}
class implication implements Showable{
@Override
public void print() {
    System.out.println("hello");
}
@Override
public void show() {
    System.out.println("Welcome");
}
}

public class a_5  {
    public static void main(String[] args) {
        run(new implication());
    }
    public static void run(printable pr){
        if(pr instanceof implication){
            implication im = (implication)pr;
            im.show();
            im.print();
        }
    }
}

