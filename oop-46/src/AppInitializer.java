public class AppInitializer {

    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.x);
        B b = c;
        //System.out.println(b.x);
        A a = c;
        System.out.println(a.x);

    }
}

class A{
    int x = 10;
}
class B extends A{
    private int x = 20;
}
class C extends B{
    int x = 30;
}
