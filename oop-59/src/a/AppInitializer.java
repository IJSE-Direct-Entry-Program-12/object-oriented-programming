package a;

import b.MyClass2;
import c.MyClass3;

public class AppInitializer {
    public static void main(String[] args) {
        MyClass3 obj = new MyClass3();
        obj.myClass3PublicMethod();
        obj.myClass2PublicMethod();
        obj.myClass1PublicMethod();
        obj.myClass1ProtectedMethod();

        MyClass2 obj2 = obj;
        obj2.myClass2PublicMethod();
        obj2.myClass1PublicMethod();
        obj2.myClass1ProtectedMethod();

        MyClass1 obj3 = obj;
        obj3.myClass1PublicMethod();
        obj3.myClass1ProtectedMethod();
        obj3.myClass1PackagePrivateMethod();
    }
}
