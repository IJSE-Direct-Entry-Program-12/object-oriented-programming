public class AppInitializer {
    public static void main(String[] args) {
        Car car = new Car();
        car.engine = new TurboEngine();
        car.startCar();
        car.stopCar();
    }
}

class Car{
   Engine engine;
   void startCar(){
       engine.start();
       System.out.println("Car started");
   }
   void stopCar(){
       engine.stop();
       System.out.println("Car stopped");
   }
}
class Engine{
    void start(){
        System.out.println("Engine started");
    }
    void stop(){
        System.out.println("Engine stopped");
    }
}
class TurboEngine extends Engine{
    void start(){
        super.start();
        System.out.println("Turbo up");
    }
    void stop(){
        System.out.println("Turbo down");
        super.stop();
    }
}