package exercise_4;

public class AppInitializer {
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.value);
    }
}

class A{
    {
        System.out.println("Instance A");
    }
    public A(){
        super();
        System.out.println("Constructor A1");
    }
}
class B extends A{

    int value;

    {
        System.out.println("Instance B");
    }
    public B(){
        super();
        System.out.println("Constructor B1" + value);
    }
    public B(int value){
        this();
        this.value = value;
        System.out.println("Constructor B2");
    }
}
class C extends B{

    {
        System.out.println("Instance C");
    }
    public C(){
        this(5);
        System.out.println("Constructor C1");
    }
    public C(int value){
        super(value);
        System.out.println("Constructor C2");
    }
}
