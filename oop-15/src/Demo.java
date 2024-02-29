public class Demo {
    static int x = 10;
    int value = 20;
    public Demo(int value) {
        this.value = value;
        x += value;
    }
    void abc(){
        abc();
        main(null);
    }

    void edf(){

    }
    public static void main(String[] args) {
        x = 30;
        new Demo(40).x += 5;
        Demo d1 = new Demo(20);

        System.out.println(Demo.x);     // Best Practice
        System.out.println(d1.x);       // Even though this can be done, it is not a good practice
    }
}

class Customer{
    String nic;
    String name;
    String contactNumber;

    public Customer(String nic, String name, String contactNumber) {
        this.nic = nic;
        this.name = name;
        this.contactNumber = contactNumber;
    }

    void printName(){
        System.out.println(name);
    }
}
