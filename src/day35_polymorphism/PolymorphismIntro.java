package day35_polymorphism;

import day31_inheritance.shapeOverriding.Circle;
import day33_abstraction.employeeTask.*;
import day34_abstraction.animalTask.*;
import day34_abstraction.carTask.*;

import java.util.Arrays;

public class PolymorphismIntro {
    public static void main(String[] args) {

        Dog dog = new Dog("Max","Husky",'M',4,"Small","White");
        Cat cat = new Cat("Max","Husky",'M',4,"Small","White");
        Tiger tiger = null;
        Eagle eagle = null;
        Lion lion = null;
        Parrot parrot = null;
        Dolphin dolphin = null;
        Shark shark = null;
        Duck duck = null;

        Animal[] animals = {dog, cat, tiger, eagle, lion, parrot, dolphin, shark, duck};

        // Animal animal = new Tesla("Model Y","Blue",2022,60000);
            // there is not "IS A" relationship between Animal and Tesla

        Animal animal = new Dog("Benny","German Shepherd",'M',4,"Small","White");
        animal.eat();
        animal.drink();
        animal.sleep();

       // animal.play();
       // animal.bark();

        System.out.println("----------------------------------------------");

        String str = "Java";

        Integer n = 100;

        Boolean r = false;

        Double d = 10.5;

        Circle circle = new Circle(4);

        Honda honda = new Honda("Civic","Blue",2019,45000);

        Audi audi = new Audi("S8","Black",2023, 85000);

        Tesla tesla = new Tesla("Model X","Red",2022,105000);

        Teacher teacher = new Teacher("Muhtar", 31, 'M', "A01", "Programming teacher", 86_000);

        Developer developer = new Developer("Luka", 23, 'M', "A02", "Software Developer", 110_000, "Java");

        Driver driver = new Driver("George", 38, 'M', "A03", "Truck driver", 75_000);

        Tester tester = new Tester("Lylia", 27, 'F', "A04", "SDET", 98_000);


        Object[] objects = {str, n, r, d, circle, honda, audi, tesla, teacher, developer, driver, tester};

        System.out.println(Arrays.toString(objects));

        Employee[] employees = {teacher, developer, driver, tester};

        Employee obj = new Driver("George", 38, 'M', "A03", "Truck driver", 75_000);

        obj.work();





    }
}
