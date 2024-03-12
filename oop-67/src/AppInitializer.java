public class AppInitializer {
    public static void main(String[] args) {

    }
}

interface Idea1{}
interface Idea2{}
interface Idea3{}
interface MyIdea extends Idea1, Idea2, Idea3{}
class MyClass1{}
class MyClass2{}
abstract class MyApp extends MyClass1 implements Idea1, Idea2{}