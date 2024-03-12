import a.MyClass1;
import a.MyClass2;
import b.MyClass3;

public class AppInitializer {

    public static void main(String[] args) {
//        MyClass1 clz1 = new MyClass1();
//        //clz1.myPackagePrivateMethod();
//        //clz1.myProtectedMethod();
//        clz1.myPublicMethod();

//        MyClass2 clz2 = new MyClass2();
//        //clz2.myPackagePrivateMethod();
//        //clz2.myProtectedMethod();
//        clz2.myPublicMethod();

        MyClass3 myClass3 = new MyClass3();
        myClass3.myPackagePrivateMethod();
        myClass3.myProtectedMethod();
        myClass3.myPublicMethod();
    }
}
