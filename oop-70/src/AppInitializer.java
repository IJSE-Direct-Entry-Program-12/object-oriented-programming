public class AppInitializer {
    public static void main(String[] args) {

    }
}

class Parent{
    public void myMethod(){}
}

abstract class Child extends Parent{
    //public abstract void myMethod();
}

interface MyInterface{
    void myMethod();
}

class MyChildClass extends Child implements MyInterface{

}
