package aggregation;

public class AppInitializer {
    public static void main(String[] args) {
        Institute ijse = new Institute();
        Teacher[] teachers = {new Teacher(), new Teacher()};
        Student[] students = {new Student(), new Student(), new Student()};
        ijse.addTeachers(teachers);
        ijse.registerStudents(students);
        ijse = null;
        for (Student student : students) System.out.println(student);
        for (Teacher teacher : teachers) System.out.println(teacher);
    }
}
class Institute{
    private Student[] students;
    private Teacher[] teachers;
    public void addTeachers(Teacher[] teachers){
        this.teachers = teachers;
    }
    public void registerStudents(Student[] students){
        this.students = students;
    }
}
class Student{}
class Teacher{}

