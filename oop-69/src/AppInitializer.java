public class AppInitializer {

    public static void main(String[] args) {
        SuperInterface subClass = new SubClass();
        subClass.myMethod();
    }
}

interface SuperInterface{
    default void myMethod(){
        System.out.println("SuperInterface: Default My Method");
    }
}

abstract class SuperClass{
    public abstract void myMethod();
}
class SubClass extends SuperClass implements SuperInterface{

    @Override
    public void myMethod() {
        System.out.println("SubClass");
    }
}
