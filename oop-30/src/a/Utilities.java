package a;

import java.util.Random;

public class Utilities {
    public static int myInt = 10;
    static int myLong = 20;
    public static final double PI =3.14;
    public static String myString = "IJSE";

    public static void myMethod(){
        System.out.println("myMethod");
    }

    public static int getNumber(){
        return new Random().nextInt();
    }

    static void myMethod2(){
        System.out.println("myMethod2");
    }
}
