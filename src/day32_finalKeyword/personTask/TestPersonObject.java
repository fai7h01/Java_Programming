package day32_finalKeyword.personTask;

import java.time.LocalDate;

public class TestPersonObject {
    public static void main(String[] args) {

        Person person = new Person("Daniel",'M', LocalDate.of(1991,1,25));

        System.out.println(person);

        person.breath();

        System.out.println("------------------------------------");

        Employee employee = new Employee("Emily",'F',LocalDate.of(2001,2,5),"Accountant",100000);

        System.out.println(employee);

        employee.breath();

        System.out.println("------------------------------------");

        Student student = new Student("Luka",'M',LocalDate.of(2000,5,10),'A',"Cydeo");

        System.out.println(student);

        student.breath();


    }
}
