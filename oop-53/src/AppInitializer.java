public class AppInitializer {
    public static void main(String[] args) {
        C c = new C();
        B b = c;
        b.execute();
    }
}
class A{
    static void myStaticMethod(){
        System.out.println("MyStaticMethod");
    }
    void myMethod(){
        System.out.println("A: MyMethod");
    }
}
class B extends A{
    
    static void myStaticMethod(){
        // You can't use the super keyword within a static context because
        // the super keyword is always associated with the instance
        // super.myStaticMethod();
    }

    void execute(){
        // However sometimes you can use the super keyword to access static members
        // within a non-static (instance) context
        super.myStaticMethod();
        myMethod();
        this.myMethod();
        B.this.myMethod();
        ((B) this).myMethod();
        ((A) this).myMethod();
        super.myMethod();
        B.super.myMethod();
    }
    void myMethod(){
        System.out.println("B: MyMethod");
    }
}
class C extends B{
    void myMethod(){
        System.out.println("C: MyMethod");
    }
}
