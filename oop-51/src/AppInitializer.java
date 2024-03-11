public class AppInitializer {
    public static void main(String[] args) {
        C c = new C();
        B b = c;
        b.myMethod();
    }
}
class A{
    int x = 10;
    void myMethod(){
        System.out.println("A: " + x);
    }
}
class B extends A{
    int x = 20;
}
class C extends B{
    int x = 30;
    public void myMethod(){
        System.out.println("C: "+ x);
    }
}
