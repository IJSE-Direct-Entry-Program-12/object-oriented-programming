public class AppInitializer {
    static {
        System.out.println("AppInitializer class object is being initialized");
    }

    public static void main(String[] args) {
        System.out.println("main()");
        System.out.println(new Student().x);
    }

}

class Student {
    static {
        System.out.println("Student class object is being initialized");
    }

    int x = 10;

    {
        System.out.println("Student object is being initialized");
        System.out.println(x);
    }
    public Student(){
        super();
        System.out.println("Student()");
    }
}
