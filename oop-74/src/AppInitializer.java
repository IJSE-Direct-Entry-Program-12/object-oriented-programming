public class AppInitializer {
    public static void main(String[] args) {
        MyInterface c = new MyClass();
        System.out.println(c.x);
    }
}

class SuperClass{
    int x = 10;
}
interface MyInterface{
    public static final int x = 20;
}

class MyClass extends SuperClass implements MyInterface{
    //int x = 30;
}
