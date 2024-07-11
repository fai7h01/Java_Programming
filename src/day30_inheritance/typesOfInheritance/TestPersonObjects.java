package day30_inheritance.typesOfInheritance;

import java.time.LocalDate;

public class TestPersonObjects {
    public static void main(String[] args) {

        Student student = new Student("Steve",'M', LocalDate.of(1998,5,11),'A',"A123");

        President president = new President("Daniel",'M',LocalDate.of(1980,3,5),LocalDate.of(2020,2,2));

        Teacher teacher = new Teacher("Melissa",'F',LocalDate.of(1985,12,12),"Math teacher","C1",95000);


        System.out.println(student);
        System.out.println(president);
        System.out.println(teacher);

        student.study();
        president.lie();
        teacher.teach();

        System.out.println("------------------------------------------");

        student.eat("burger");
        president.eat("kebab");
        teacher.eat("donut");

        student.drink("milk");
        president.drink("poison");
        teacher.drink("water");


    }
}
