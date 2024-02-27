public class AppInitializer {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Kasun");
        Employee e2 = new Employee(2, "Nuwan");
        e2.print();
        e1.print();
    }
}
class Employee{
    int id; String name;
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("Employee object has been just initialized");
    }
    void print(){
        System.out.printf("id=%s, name=%s \n", id, name);
    }
}
