public class AppInitializer {

    public static void main(String[] args) {
        B b = new B();
        b.myMethod();
        A a = b;
        a.myMethod();
    }
}

class A{
    final void myMethod(){
        System.out.println("MyMethod");
        myFunction();
    }
    private void myFunction(){
        System.out.println("MyFunction");
    }
    final static public void myStaticMethod(){}
}
class B extends A{
//    static void myStaticMethod(){}
//    @Override
//    void myMethod() {
//        System.out.println("I don't like ClassA myMethod");
//    }
}
