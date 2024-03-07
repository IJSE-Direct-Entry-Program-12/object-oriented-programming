package exercise_1;

class D{
    int x = A.a;
    static int b = 20;
    static{
        System.out.println("D: Static Initializer");
    }
    {
        System.out.println("D: Instance Initializer");
        b++;
    }
}

public class AppInitializer extends D{
    int y = b;
    static{
        System.out.println("AppInitializer: Static Initializer");
    }
    {
        System.out.println("AppInitializer: Instance Initializer");
    }
    public static void main(String[] args) {
        B b = new B(5,2);
        System.out.println(b.x);
        System.out.println(b.y);
        System.out.println(b.a);
        System.out.println(b.b);
    }
}

class C extends AppInitializer{
    static{
        System.out.println("C: Static Initializer");
    }
    {
        System.out.println("C: Instance Initializer");
    }
}
class A extends C{
    static int a = 10;
    static{
        System.out.println("A: Static Initializer");
        b++;
    }
    {
        System.out.println("A: Instance Initializer");
        y += ++a;
    }
}
class B extends A{
    static{
        System.out.println("B: Static Initializer");
    }
    {
        System.out.println("B: Instance Initializer");
    }
    public B(int x, int y) {
        this.x += ++x;
        this.y += y;
        System.out.println("B: Constructor");
    }
}

