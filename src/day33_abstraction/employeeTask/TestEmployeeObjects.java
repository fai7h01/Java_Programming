package day33_abstraction.employeeTask;

public class TestEmployeeObjects {
    public static void main(String[] args) {

        // Employee  employee= new Employee("Daniel",54,'M',"A1","SDET",85_000);
                // we can not create objects from an abstract class, Object MUST be created from a concrete class

        Teacher teacher = new Teacher("Muhtar", 31, 'M', "A01", "Programming teacher", 86_000);

        Developer developer = new Developer("Luka", 23, 'M', "A02", "Software Developer", 110_000, "Java");

        Driver driver = new Driver("George", 38, 'M', "A03", "Truck driver", 75_000);

        Tester tester = new Tester("Lylia", 27, 'F', "A04", "SDET", 98_000);

        System.out.println(teacher);
        System.out.println(developer);
        System.out.println(driver);
        System.out.println(tester);

        System.out.println("------------------------------------");

        teacher.work();
        developer.work();
        driver.work();
        tester.work();

    }
}
