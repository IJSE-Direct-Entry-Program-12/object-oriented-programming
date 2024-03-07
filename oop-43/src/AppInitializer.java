public class AppInitializer {
    {
        B.y += 2 + ((C)this).x;
    }
    {
        System.out.println("AppInitializer: Instance");
    }
    static{
        System.out.println("AppInitializer: Static");
    }
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.z);    // 33
        System.out.println(c.x);    // 11
        System.out.println(c.a);    // 13
        System.out.println(c.y);    // 23
    }
}
class B extends AppInitializer{
    static int y = 20;
    {
        System.out.println("B: Instance");
    }
    static{
        System.out.println("B: Static");
    }
}
class A extends B{
    int x = 10;
    static{
        y = D.a;
    }
    {
        System.out.println("A: Instance");
    }
    static{
        System.out.println("A: Static");
    }
}
class D extends A{
    static int a = 15 + y;
    { a = x + 2; }
    D(int value){
        y += value;
        {
            a++;
        }
    }
    {
        System.out.println("D: Instance");
    }
    static{
        System.out.println("D: Static");
    }
}
class C extends D{
    {
        y = x + a;
    }
    int z = x + y;
    static {
        y += 3;
    }
    public C() {
        super(2);
        System.out.println(" ");
        x++;
    }
    {
        System.out.println("C: Instance");
    }
    static{
        System.out.println("C: Static");
    }
}
