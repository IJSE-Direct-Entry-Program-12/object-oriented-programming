public class Demo2 {
    static void abc(){          // Static Method
        int x = 10;             // Local Variable
    }
    int add(int x, int y){      // Instance Method
        return x + y;
    }
    Demo2(){                    // Constructor (A special instance method)
        int x = 20;             // Local Variable
    }
    static int Demo2(int x, int y){     // Static Method
        int result = x-y;               // Local Variable
        return result;
    }
    void Demo2(){                   // Instance Method
        class Something{}           // Local Inner Class
    }
}
