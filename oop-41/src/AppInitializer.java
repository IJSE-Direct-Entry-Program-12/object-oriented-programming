public class AppInitializer {
    static{
        System.out.println("AppInitializer class is being initialized");
    }
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("Sub");
        Sub s = new Sub();
        System.out.println(s.a);
        System.out.println(s.b);
        System.out.println(s.y);
        System.out.println(s.x);
    }
}
class Super{
    static int x = 10;
    int a = 10;
    static { System.out.println("Super class is being initialized"); }
    { System.out.println("Super Instance Initializer"); }
    public Super() { System.out.println("Super Constructor"); }
}
class Sub extends Super{
    static int y = 20;
    int b = 20;
    static{ System.out.println("Sub class is being initialized"); }
    { System.out.println("Sub Instance Initializer");}
    public Sub(){ System.out.println("Sub Constructor");}
}


// AppInitializer class is being initialized
// Super class is being initialized
// Sub class is being initialized

// Super Instance Initializer
// Super Constructor
// Sub Instance Initializer
// Sub Constructor