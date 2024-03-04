package b;

//import a.Utilities;               // Single-Type Import
//import a.*;                       // On-Demand-Type Import
import a.Utilities;
import static a.Utilities.*;        // On-Demand-Static Import

//import static a.Utilities.myInt;        // Single-Static Import
//import static a.Utilities.PI;        // Single-Static Import
//import static a.Utilities.myString;        // Single-Static Import
//import static a.Utilities.myMethod;        // Single-Static Import
//import static a.Utilities.getNumber;        // Single-Static Import
public class Demo {
    static int x = 10;
    public static void main(String[] args) {
        System.out.println(Utilities.myInt);
        System.out.println(myInt);
        // System.out.println(Utilities.myLong);
        System.out.println(PI);
        System.out.println(myString);
        myMethod();
        System.out.println(getNumber());
        // Utilities.myMethod2();
    }
}
class Customer {
    static int x = 20;
    static void myMethod(){
        System.out.println(PI);
        System.out.println(myString);
    }
}