public class AppInitializer {
    static{
        System.out.println("AppInitializer class object is being initialized");
    }
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("Main()");
        // 1. Creating an instance (Implicit)
        // new Demo();

        // 2. Accessing a static member (Implicit)
        //System.out.println(Demo.x);
//        Demo.print();
//        Demo.print();
//        Demo.print();
//        Demo.print();

        // 3. Invoking Class.forName() (Explicit)
        Class.forName("Demo");
    }
}

class Demo {
    public Demo(){}
    static int x = 10;
    static void print(){
        int a = 20;
        System.out.println("print()");
    }
    int y = 20;
    static{
        System.out.println("Demo class object is being initialized");
    }
}
