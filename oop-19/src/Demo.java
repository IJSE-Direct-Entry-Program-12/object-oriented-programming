public class Demo {
    public static void main(String[] args) {
        Student s = null;   // This does not load the Student Class
        printStudent(s);
    }

    public static void printStudent(Student s){ // Neither this
        System.out.println(s);
    }
}

class Student{
    static{
        System.out.println("Student class object is being loaded");
    }
}
