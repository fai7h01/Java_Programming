package day25_constructor;

import java.time.LocalDate;

public class TestEmployeeObjects {
    public static void main(String[] args) {

        Employee e1 = new Employee("Luka",23,'M',"Java developer", 75000, LocalDate.of(2024,9,15));

        Employee e2 = new Employee("Sarah",25,'F',"Penetration Tester",105000,LocalDate.of(2022,5,9));

        System.out.println(e1);

        System.out.println(e2);


    }
}
