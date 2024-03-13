public class AppInitializer {
    public static void main(String[] args) {
        MyInterface clz = new MyClass();
        clz.myMethod();

        MySuperClass clz2 = new MyChildClass();
        clz2.myMethod();
    }
}

interface MyInterface{
    void myMethod();
}

class MyClass implements MyInterface{
    @Override
    public void myMethod() {
        System.out.println("MyClass: myMethod");
    }
}

abstract class MySuperClass{
    public abstract void myMethod();
}

class MyChildClass extends MySuperClass{

    public void myMethod() {
        System.out.println("MyChildClass: myMethod");
    }
}



