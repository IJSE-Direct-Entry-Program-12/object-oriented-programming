package composition;

public class AppInitializer {
    public static void main(String[] args) {
        Car c = new Car();
        System.out.println(c.getEngine());
        System.out.println(c.getFrontLights());
        c = null;
        System.out.println(c.getEngine());   // Now I can't access the engine anymore
    }
}

class Vehicle {
}

class Car extends Vehicle {
    private Engine engine = new Engine();
    private Light frontLights = new Light();
    private Light rearLights = new Light();
    private Seat frontSeats = new Seat();
    private Seat rearSeats = new Seat();

    public Engine getEngine() {
        return engine;
    }

    public Light getFrontLights() {
        return frontLights;
    }

    public Light getRearLights() {
        return rearLights;
    }

    public Seat getFrontSeats() {
        return frontSeats;
    }

    public Seat getRearSeats() {
        return rearSeats;
    }
}

class Engine {
}

class Light {
}

class Seat {
}