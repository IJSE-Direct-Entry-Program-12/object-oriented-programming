public class AppInitializer {
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.x);
        B b = c;
        System.out.println(b.x);
    }
}

class A{
    int x = 10;
}
class B extends A{
    static int x = 20;
}
class C extends B{
    static int x = 30;
}
