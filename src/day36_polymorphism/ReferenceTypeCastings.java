package day36_polymorphism;

import day29_inheritance.animalTask.Animal;
import day29_inheritance.animalTask.Cat;
import day29_inheritance.animalTask.Dog;
import day30_inheritance.phoneTask.Iphone;
import day30_inheritance.phoneTask.Nokia;
import day30_inheritance.phoneTask.Phone;
import day33_abstraction.employeeTask.*;
import day35_polymorphism.trasnportationTask.AutoPilot;
import day35_polymorphism.trasnportationTask.Electric;
import day35_polymorphism.trasnportationTask.Tesla;

public class ReferenceTypeCastings {
    public static void main(String[] args) {

        // Dog dog = new Dog();

       // Cat cat = new Dog();

        Animal animal = (Animal) new Dog(); // upcasting is done implicitly

        System.out.println("-------------------------------------------------------");

        Animal animal1 = new Dog(); // upcasting ==> Polymorphism
        animal1.setInfo("Ben","German Shepherd","Large","Black and yellow",'M',7);

        animal1.eat();
        animal1.drink();
        animal1.sleep();

        ( (Dog)animal1 ).bark(); // downCasting

       // Dog dog1 = (Dog)animal1; // downCasting
       // dog1.bark();

        // ((Cat)animal1).scratch(); // Dog can not be converted to Cat, because there is not "IS A" relationship between Dog and Cat

        System.out.println("-------------------------------------------------------");

        Phone phone =  new Nokia("XR20", "Small", "Black", 350);
        phone.call(911);
        phone.call(123456);

        ((Nokia) phone).selfDefense(); // down casting

    //    ((Iphone)phone).faceTime(123456); // Nokia can not be converted to Iphone, because there is no "IS A" relationship between Nokia and Iphone

        ((Nokia) phone).selfDefense();

        System.out.println("-------------------------------------------------------");

        Employee employee = new Developer("Luka", 23, 'M', "A02", "Software Developer", 110_000, "Java");

        employee.work();

        System.out.println(((Developer) employee).getProgrammingLanguage());

        //Tester tester = (Tester)employee; // Class Cast Exception, because there is not "IS A" relationship between Developer and Tester

        System.out.println("-------------------------------------------------------");

        Electric electric = new Tesla("Tesla","CyberTruck","Silver",2024,95000);

        electric.charge();
        ((Tesla) electric).selfDrive();
        ((AutoPilot)electric).selfDrive();

        Employee employee1 = new Teacher("Muhtar", 31, 'M', "A01", "Programming teacher", 86_000);

        Employee employee2 = new Developer("Luka", 23, 'M', "A02", "Software Developer", 110_000, "Java");

        Employee employee3 = new Driver("George", 38, 'M', "A03", "Truck driver", 75_000);

        Employee employee4 = new Tester("Lylia", 27, 'F', "A04", "SDET", 98_000);

        employee1.work();
        employee2.work();
        employee3.work();
        employee4.work();





    }
}
