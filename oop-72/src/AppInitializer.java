public class AppInitializer {
    public static void main(String[] args) {

    }
}
class Parent{}
interface MyInterface1{
    default void myMethod(){
        System.out.println("MyInterface1: myMethod");
    }
}
interface MyInterface2 extends MyInterface1{
//    default void myMethod(){
//        System.out.println("MyInterface2: myMethod");
//    }
}
interface MyInterface3{
    default void myCrazyMethod(){
        System.out.println("MyCrazyMethod");
    }
}
class MyClass extends Parent implements MyInterface2{

}

