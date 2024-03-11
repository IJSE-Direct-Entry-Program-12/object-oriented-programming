public class AppInitializer {
    public static void main(String[] args) {
        D d = new D();
        B b = d;
        b.execute();
    }
}

class A{
    int x = 10;
    void myMethod(){
        System.out.println("A: " + x);
    }
}
class B extends A{
    static int x = 20;
    void execute(){
        myMethod();                 // Runtime Polymorphism ✅
        ((A)this).myMethod();       // Runtime Polymorphism ✅
        super.myMethod();           // Runtime Polymorphism ❌
    }
}
class C extends B{
    void myMethod(){
        System.out.println("C: " + x);
    }
}
class D extends C{
    static int x = 40;
    void myMethod(){
        System.out.println("D: " + x);
    }
}
