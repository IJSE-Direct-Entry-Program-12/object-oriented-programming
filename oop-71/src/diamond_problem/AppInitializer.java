package diamond_problem;

public class AppInitializer {
    public static void main(String[] args) {
        new MyClass().myMethod();
    }
}

interface A{
    default void myMethod(){
        System.out.println("A: Hello");
    }
}
interface B extends A{
    default void myMethod(){
        System.out.println("B: Hello");
    }
}
interface C extends A{
    default void myMethod(){
        System.out.println("C: Hello");
    }
}
//interface D extends B, C{
//
//}
class SuperClass{
    public void myMethod(){
        System.out.println("C: Hello");
    }
}
class MyClass extends SuperClass implements B, C{

}
