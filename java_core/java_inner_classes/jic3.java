package java_core.java_inner_classes;
//static nested class




public class jic3 {
    static int data =30;
    static class Inner{
        static void msg(){System.out.println(data);}

        void msgi(){System.out.println(data);}
    }
       
    public static void main(String[] args) {
            jic3.Inner.msg();
            //or
            var obj  = new jic3.Inner();
            obj.msgi();
            
                            
    }
}
