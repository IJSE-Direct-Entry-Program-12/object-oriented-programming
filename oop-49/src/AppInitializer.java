public class AppInitializer {
    public static void main(String[] args) {
        C c = new C();
        c.myMethod();
    }
}
class A{
    int x = 10;
}
class B extends A{
    static int x = 20;
//    void myMethod(){
//        System.out.println(x);
//        System.out.println(super.x);
//    }
}
class C extends B{
//    void myMethod(){
//        System.out.println(x);
//        System.out.println(((B) this).x);
//    }
    void myMethod(){
        //System.out.println(x);
        B b = this;
        // b.x == super.x
        //System.out.println(super.super.x);
    }
}
