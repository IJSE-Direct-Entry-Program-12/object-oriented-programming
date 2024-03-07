public class AppInitializer {
    public static void main(String[] args) {

    }
}
class A{
    int x = 10;
//    static void myMethod(){
//        System.out.println("A: myMethod()");
//    }
    static class NestedClass{}
}
class B extends A{
    static String x = "ijse";
//    void myMethod(){
//        System.out.println("A: myMethod()");
//    }
    class NestedClass{}
}
