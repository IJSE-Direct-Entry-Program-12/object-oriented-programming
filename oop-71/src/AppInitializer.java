public class AppInitializer {
    public static void main(String[] args) {

    }
}

interface MyInterface1{
    default void myMethod(){
        System.out.println("MyInterface1");
    }
}
interface MyInterface2{
    default void myMethod(){
        System.out.println("MyInterface2");
    }
}
class ParentClass{
    public void myMethod(){}
}
class MyClass extends ParentClass implements MyInterface1, MyInterface2{
//    public void myMethod(){}
}
