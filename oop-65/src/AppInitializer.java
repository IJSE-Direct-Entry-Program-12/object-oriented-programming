public class AppInitializer {
    public static void main(String[] args) {
        MyApp app = new MyApp();
        Object app2 = app;
        MyAppIdea app3 = app;
        // new MyAppIdea();
    }
}

// Interfaces are implicitly abstract
// Interface are fully abstract classes
// Abstract methods are always instance methods
// *** Interfaces are implicitly static ***
interface MyAppIdea{
    void start();       // Method headers are implicitly public and abstract
    void exit();
    void play();
    void pause();
    void stop();
}
class MyApp implements MyAppIdea{

    public void start() {
        System.out.println("MyApp: Start");
    }

    @Override
    public void exit() {
        System.out.println("MyApp: Exit");
    }

    @Override
    public void play() {
        System.out.println("MyApp: Play");
    }

    @Override
    public void pause() {
        System.out.println("MyApp: Pause");
    }

    @Override
    public void stop() {
        System.out.println("MyApp: Stop");
    }
}
