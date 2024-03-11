public class AppInitializer {
    public static void main(String[] args) {
        C c = new C();
//        System.out.println(c.x);
//        c.myStaticMethod();
//        System.out.println(c.y);
//        c.myMethod();
        B b = c;
        System.out.println(b.x);
        b.myStaticMethod();
        System.out.println(b.y);
        b.myMethod();
    }
}

class T{}
class S extends T{}


class A {
    static String x = "ijse";
    int y = 10;
    static void myStaticMethod(){
        System.out.println("A Static: " + x);
    }
    void myMethod(){
        System.out.println("A(x): " + x);
        System.out.println("A(y): " + y);
    }
}
class B extends A {
    static int x = 20;
    int y = 20;
    static void myStaticMethod(){
        System.out.println("B Static: " + x);
    }
    void myMethod(){
        System.out.println("B(x): " + x);
        System.out.println("B(y): " + y);
    }
}
class C extends B {
    static int x = 30;
    int y = 30;
    static void myStaticMethod(){
        System.out.println("C Static: " + x);
    }
    void myMethod(){
        System.out.println("C(x): " + x);
        System.out.println("C(y): " + y);
    }
}