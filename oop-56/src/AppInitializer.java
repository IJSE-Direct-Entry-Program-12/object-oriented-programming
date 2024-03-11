public class AppInitializer {
    public static void main(String[] args) {
        Employee[] employees = {new Employee(), new Employee(), new CEO(),
                new Manager(1250), new Manager(750),
                new Executive(), new Executive(), new Employee(), new Employee()};
        for (Employee employee : employees) {
            /*if (employee instanceof Manager m){
                //Manager m = (Manager) employee;
                m.printManager();
            }else if (employee instanceof CEO ceo){
                //CEO ceo = (CEO) employee;
                ceo.printCEO();
            }else if (employee instanceof Executive executive){
                //Executive executive = (Executive) employee;
                executive.printExecutive();
            }else{
                System.out.println("Just a regular employee");
            }*/
            switch (employee){
                case Manager m when m.salary > 1000 -> System.out.println("Manager+");
                case Manager m -> m.printManager();
                case CEO ceo -> ceo.printCEO();
                case Executive executive -> executive.printExecutive();
                default -> System.out.println("Regular employee");
            }
        }
    }
}

class Employee {
}

class Executive extends Employee {
    void printExecutive() {
        System.out.println("Executive");
    }
}

class CEO extends Executive {
    void printCEO() {
        System.out.println("CEO");
    }
}

class Manager extends Employee {
    double salary;
    public Manager(double salary) {
        this.salary = salary;
    }
    void printManager() {
        System.out.println("Manager");
    }
}
