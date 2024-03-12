package c;

import a.MyClass1;
import b.MyClass2;

public class AppInitializer {
    public static void main(String[] args) {
        MyClass3 obj = new MyClass3();
        obj.myClass3PublicMethod();
        obj.myClass3ProtectedMethod();
        obj.myClass3PackagePrivateMethod();
        obj.myClass2PublicMethod();
        obj.myClass1PublicMethod();

        MyClass2 obj2 = obj;
        obj2.myClass2PublicMethod();
        obj2.myClass1PublicMethod();

        MyClass1 obj3 = obj;
        obj3.myClass1PublicMethod();
    }
}
