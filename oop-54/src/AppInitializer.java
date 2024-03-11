public class AppInitializer {
    public static void main(String[] args) {
        Prius prius = new Prius();      // Identity Conversion
//        Prius ref = prius;              // Identity Conversion
//        ToyotaCar toyotaCar = prius;    // Widening Reference Conversion
//        ToyotaCar toyotaCar2 = (ToyotaCar) prius;    // Widening Reference Conversion
//        Car car = prius;                // Widening Reference Conversion
//        Vehicle vehicle = prius;        // Widening Reference Conversion
//        Object object = prius;          // Widening Reference Conversion
//        Premio premio = new Premio();
        //Car car = prius;
//        Vehicle car = premio;
        //Prius ref = (Prius) car;            // Narrowing Reference Conversion
//        Townace townace = (Townace) car;
        Vehicle vehicle = prius;
        //vehicle = new Premio();
        if (vehicle instanceof Prius){
            Prius priusRef = (Prius) vehicle;
            System.out.println("Vehicle is a prius");
        }else{
            System.out.println("vehicle is not a prius");
        }

        Premio premio = new Premio();
        System.out.println(premio instanceof Premio);           // true
        System.out.println(premio instanceof ToyotaCar);        // true
        System.out.println(premio instanceof Car);              // true
        System.out.println(premio instanceof Vehicle);          // true
        System.out.println(premio instanceof Object);           // true
         //System.out.println(premio instanceof Prius);
        Vehicle t = premio;
        System.out.println(premio == t);
        System.out.println(t instanceof Townace);
    }
}
class Vehicle{}
class Car extends Vehicle{}
class Van extends Vehicle{}
class Townace extends Van{}
class ToyotaCar extends Car{}
class HondaCar extends Car{}
class Prius extends ToyotaCar{}
class Premio extends ToyotaCar{}
