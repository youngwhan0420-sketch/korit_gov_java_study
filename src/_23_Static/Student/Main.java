package _23_Static.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(Student.curriculum);
        System.out.println(student.getStatic());
        Student student1 = new Student();
        System.out.println(student1.getStatic());
    }
}