public class AppInitializer {
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.x);    // 30
        B b = c;
        System.out.println(b.x);    // 10
        A a = c;
        System.out.println(a.x);    // 10
        Object o = c;
        //System.out.println(o.x);
    }
}
class A{
    int x = 10;
}
class B extends A{
    //int x = 20;
}
class C extends B{
    int x = 30;
}
