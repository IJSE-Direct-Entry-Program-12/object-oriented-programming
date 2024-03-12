package b;

public class AppInitializer {
    public static void main(String[] args) {
//        MyClass3 clz3 = new MyClass3();
////        clz3.myPrivateMethod();
////        clz3.myPackagePrivateMethod();
////        clz3.myProtectedMethod();
//        clz3.myPublicMethod();

        MyClass3 myClass3 = new MyClass3();
        myClass3.myPackagePrivateMethod();
        myClass3.myProtectedMethod();
        myClass3.myPublicMethod();
    }
}
