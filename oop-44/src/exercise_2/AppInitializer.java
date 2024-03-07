package exercise_2;

class C {
    static {
        System.out.println("C: static");
    }
    {
        System.out.println("C: instance");
    }
    int x;
    static int a = 10;
}

class B extends C {
    static {
        System.out.println("B: static");
    }
    {
        System.out.println("B: instance");
    }
    int y;
    static int b = 20;
    static {
        a += 2;
    }
}

class A extends B {
    static {
        System.out.println("A: static");
    }
    {
        System.out.println("A: instance");
    }
    static {
        b += 2;
    }
}

public class AppInitializer extends A {
    static {
        System.out.println("AppInitializer: static");
    }
    {
        System.out.println("AppInitializer: instance");
    }
    public AppInitializer() {
        b++;
        System.out.println("AppInitializer: constructor");
    }
    public static void main(String[] args) {
        D d = new D(5, 2).main();
        System.out.println(d.a);
        System.out.println(d.b);
    }
}

class D extends AppInitializer {
    D(int x, int y) {
        this.x = b + x;
        this.y = a + y;
        System.out.println("D: constructor");
    }
    D main() {
        x++;
        y--;
        System.out.println(x);
        System.out.println(y);
        return this;
    }
    static {
        System.out.println("D: static");
    }
    {
        System.out.println("D: instance");
    }
}








