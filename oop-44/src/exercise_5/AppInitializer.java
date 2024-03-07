package exercise_5;

public class AppInitializer {
    public static void main(String[] args) {
        new C(10);
    }
}
class A {
    int value;
    {
        System.out.println("A: Instance");
    }
    public A(){
        System.out.println("A: Constructor");
    }
}
class B extends A {
    public B() {
        System.out.println(value);
        System.out.println("B: Constructor 1");
    }
    {
        value++;
        System.out.println("B: Instance");
    }
    public B(int value) {
        this();
        this.value += value;
        System.out.println("B: Constructor 2");
    }
}
class C extends B {
    {
        System.out.println("C: Instance" + value);
    }
    public C(int value) {
        super(value);
        System.out.println("C: Constructor");
    }
}
