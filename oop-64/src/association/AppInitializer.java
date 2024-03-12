package association;

public class AppInitializer {
    public static void main(String[] args) {

    }
}
class Vehicle{}
class Car extends Vehicle{
    Engine engine;
    Light frontLights;
    Light rearLights;
    Seat frontSeats;
    Seat rearSeats;
}
class Engine{}
class Light{}
class Seat{}