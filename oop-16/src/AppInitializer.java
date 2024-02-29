public class AppInitializer {

    public static void main(String[] args) {
        new Student(1, "Kasun");
        new Student(1, "Kasun", 85);
    }
}

class Teacher{
   String nic;
   String name;
   String contact;
   Student[] studentList;
   public Teacher(String nic, String name, String contact, Student... studentList){
       this.nic = nic;
       this.name = name;
       this.contact = contact;
       this.studentList = studentList;
   }

   public Student findBestStudent(){
       int topMarks = studentList[0].marks;
       Student topStudent = studentList[0];
       for (int i = 1; i < studentList.length; i++) {
           if (topMarks < studentList[i].marks){
               topMarks = studentList[i].marks;
               topStudent = studentList[i];
           }
       }
       return topStudent;
   }
}

class Student{
    int id;
    String name;
    int marks;
    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }
    public Student(int id, String name, int marks){
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public static Student findBestStudent(Student s1, Student s2){
        return null;
    }
}
