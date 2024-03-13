public class AppInitializer {

    public static void main(String[] args) {
        new MyClass().myCrazyMethod();
    }
}
interface MyInterface{
    private void myMethod(){
        System.out.println("MyInterface: MyMethod");
    }
    default void myCrazyMethod(){
        myMethod();
    }
}
class MyClass implements MyInterface{
    public void myMethod(){
        System.out.println("MyClass: MyMethod");
    }
}
