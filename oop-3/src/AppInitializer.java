public class AppInitializer {

    public static void main(String[] arguments) {
        System.out.println("Hello ClassLoaders");
        new Customer();
        new Customer();
        new Customer();
        new Customer();
    }
}

class Customer {

}