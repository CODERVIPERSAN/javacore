package abstraction;

interface Drawable{

    void draw();
    // Drawable getDrawableInstant();
}


class Rectangle implements Drawable{
    @Override
    public void draw() {
        System.out.println("drawing rectangle");
    }
    public static Drawable getDrawableInstant() {
        return new Rectangle();
    }
}

class Circle implements Drawable{
    @Override
    public void draw() {
        System.out.println("draw Circle ");
    }

    public static  Drawable getDrawableInstant() {
        return new Circle();
    }
}

public class a_4{
    public static void main(String[] args) {
        Drawable draw= getObj();
        if(draw instanceof Circle){
            Circle cir = (Circle)draw;//downcast
            cir.draw();
        }else if(draw instanceof Rectangle){
            Rectangle rect = (Rectangle) draw;//downcast 
            rect.draw();
        }
        

    }
    public static Drawable  getObj(){
        int ch =  new java.util.Scanner(System.in).nextInt();
        switch (ch) {
            case 1:
                return Rectangle.getDrawableInstant();

            case 2:
            return Circle.getDrawableInstant();
            
        }
        return null;
    
    }
}