public class AppInitializer {
    public static void main(String[] args) {
        MyApp app = new MyApp();
        AppIdea app2 = app;
        Object app3 = app;
    }
}

interface MyInterface{
    public static final int x = 10;
    public static void myMethod(){  // Implicitly public
        System.out.println("I can place static methods in interfaces");
    }
    public default void myInstanceMethod(){ // Implicitly public
        System.out.println("Wow now I can place instance methods in Interfaces");
    }

    private static void myHelperMethod(){
        System.out.println("I can place helper static methods in interfaces");
    }
    private void myHelperInstanceMethod(){
        System.out.println("Wow now I can place helper instance methods in Interfaces");
    }

    public static class MyNestedClass{} // Implicitly Public Static
//     abstract synchronized void myCrazyMethod();
//     native void myNativeCrazyMethod();
void doSomething();
}

abstract class AppIdea{

    void start(){
        System.out.println("App start");
    }
    native void myNativeCrazyMethod();
    // abstract native void myNativeAbstractCrazyMethod();
    protected abstract void stop();
    abstract void play();
    void exit(){
        System.out.println("App Exit");
    }
}
class MyApp extends AppIdea{

    @Override
    protected void stop() {

    }

    @Override
    void play() {

    }
}

