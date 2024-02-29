public class AppInitializer {
    public static void main(String[] args) {
        // Person: A
        Customer c1 = new Customer("Kasun");
        c1.print();
       // c1.nextCustomerId = -5;

        // Person: B
        Customer c2 = new Customer("Nuwan");
        // c2.id = 5;
        c2.print();
    }
}

class Customer{
    private int id;
    protected String name;
    private static int nextCustomerId = 1;
    public Customer(String name) {
        this.id = nextCustomerId++;
        this.name = name;
    }
    void print(){
        System.out.printf("id=C%03d, name=%s \n", id , name);
    }
}
