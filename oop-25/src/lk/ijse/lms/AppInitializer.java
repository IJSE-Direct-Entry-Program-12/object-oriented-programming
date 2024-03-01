package lk.ijse.lms;

//import lk.ijse.lms.service.CourseService;
//import lk.ijse.lms.service.StudentService;

import lk.ijse.lms.service.*;
import lk.ijse.lms.entity.Course;
import lk.ijse.lms.entity.Student;

public class AppInitializer {

    public static void main(String[] args) {
        System.out.println("main()");
        new StudentService();
        new CourseService();
        new Course();
        new Student();
    }
}
