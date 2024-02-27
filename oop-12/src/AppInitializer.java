public class AppInitializer {
    public static void main(String[] args) {
        Engine e = new Engine();
        Car c = new Car(e);
        System.out.println(e);
        e = null;
        System.out.println(c.e);
    }
}
class Car{
    static{ System.out.println("Car class object is being initialized");}
    Engine e;
    public Car(Engine e) {
        this.e = e;
    }
    {System.out.println("Car object is being initialized"); }
}
class Engine{
    static{ System.out.println("Engine class object is being initialized"); }
    { System.out.println("Engine object is being initialized"); }
}
