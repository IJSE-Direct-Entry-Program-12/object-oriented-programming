public class AppInitializer {

    public static void main(String[] args) {

    }
}

sealed class MyVeryImportantClass{}
sealed class MyClass1 extends MyVeryImportantClass permits MySubClass{}
final class MySubClass extends MyClass1{}
final class MyClass2 extends MyVeryImportantClass{}
non-sealed class MyClass3 extends MyVeryImportantClass{}
class SomeOtherClass1 extends MyVeryImportantClass{}
class SomeOtherClass2 extends MyClass3{}
