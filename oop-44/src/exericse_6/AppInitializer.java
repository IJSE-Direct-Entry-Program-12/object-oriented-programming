package exericse_6;

public class AppInitializer {
    public static void main(String[] args) {
        B b = new B();
        b.value += b.ref.value;
        System.out.println(b.value);
        System.out.println(b.ref.value);
    }
}

class A{
    static B ref;
    int value;
}
class B extends A{
    public B(){
        this(ref = new B(8));
    }
    public B(B b){
        this(5);
    }
    public B(int value){
        this.value = value;
    }
}
