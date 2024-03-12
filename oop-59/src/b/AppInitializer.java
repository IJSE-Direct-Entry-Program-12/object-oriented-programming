package b;

import a.MyClass1;
import c.MyClass3;

public class AppInitializer {
    public static void main(String[] args) {
        MyClass3 obj = new MyClass3();
        obj.myClass3PublicMethod();
        obj.myClass2PublicMethod();
        obj.myClass2ProtectedMethod();
        obj.myClass1PublicMethod();

        MyClass2 obj2 = obj;
        obj2.myClass2PublicMethod();
        obj2.myClass2ProtectedMethod();
        obj2.myClass2PackagePrivateMethod();
        obj2.myClass1PublicMethod();

        MyClass1 obj3 = obj;
        obj3.myClass1PublicMethod();
    }
}
