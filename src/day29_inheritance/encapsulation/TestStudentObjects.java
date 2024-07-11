package day29_inheritance.encapsulation;

public class TestStudentObjects {
    public static void main(String[] args) {

        Student student1 = new Student("Luka",23,'M','A', "Cydeo");

        System.out.println(student1);

        student1.setSchoolName("Harvard");
        student1.setGrade('B');

        System.out.println(student1);

    }
}
