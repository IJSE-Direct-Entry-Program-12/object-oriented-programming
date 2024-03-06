public class AppInitializer extends Object{
    public AppInitializer() {
        super();
    }

    static {
        System.out.println("AppInitializer class object is being initialized");
    }

    public static void main(String[] args) {
        System.out.println("AppInitializer: main() Method");
        Child c = new Child();
        System.out.println(c);
        System.out.println(c.a);
        System.out.println(c.b);
        System.out.println(c.c);
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
    }
}

class Parent extends Object{
    static int x = 10;
    int a = 10;
    static {
        System.out.println("Parent class object is being initialized: " + x);
    }
    {
        System.out.println("Parent: object is being initialized: " + x);
    }
    public Parent() {
        super();
        System.out.println("Parent: constructor: " + this);
    }
}

class Middle extends Parent {
    static int y = 20;
    int b = 20;
    static {
        System.out.println("Middle class object is being initialized: " + x);
    }
    {
        System.out.println("Middle: instance is being initialized: " + a);
    }
    public Middle() {
        super();
        System.out.println("Middle: constructor: " + this);
    }
    {
        a += 2;
    }
}

class Child extends Middle {
    static int z = y + x;
    int c = a + b + x;
    {
        System.out.println("Child: object is being initialized: " + c);
    }
    static{
        System.out.println("Child class object is being initialized");
    }
    public Child() {
        System.out.println("Child: constructor: " + this);
        System.out.println(c);
    }
    {
        c += 5;
    }
}

// AppInitializer class object is being initialized
// AppInitializer: main() Method
// Parent class object is being initialized: 10
// Middle class object is being initialized: 10
// Child class object is being initialized
// Parent: object is being initialized: 10
// Parent: constructor: 0xFFFF
// Middle: instance is being initialized: 10
// Middle: constructor: 0xFFFF
// Child: object is being initialized: 42
// Child: constructor: 0xFFFF
// 47
// 0xFFFF
// 12
// 20
// 47
// 10
// 20
// 30