public class AppInitializer {

    public static void main(String[] args) {
        new Child(10,20);
    }
}
class Parent{
    public Parent() {
        System.out.println("Parent()");
    }
    public Parent(int x) {
        System.out.println("Parent(int)");
    }
}
class Child extends Parent{
    public Child(int x, int y) {
        super();
        System.out.println("Child(int, int)");
    }
    public Child(int x, int y, int z) {
        this(x,y);
        System.out.println("Child(int, int, int)");
    }
}
