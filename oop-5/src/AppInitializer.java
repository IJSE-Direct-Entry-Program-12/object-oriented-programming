public class AppInitializer {
    static int x = 10;      // Static Variable
    int y = 20;             // Instance Variable

    static {                // Static Initializer
        System.out.println("Static Initializer 1");
    }

    // Static Method
    public static void main(String[] args) {
        int y = 20;         // Local Variable
        System.out.println(y);
    }

    static {                // Static Initializer
        int x = 20;         // Local Variable
        System.out.println("Static Initializer 2");
    }

    static int z = 20;      // Static Variable
}
