package day29_inheritance.animalTask;

public class Zoo {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Ben", "German Shepherd", "Large", "Black", 'M', 6);

        Cat cat = new Cat();
        cat.setInfo("Lucy", "Sphinx", "Small", "Grey", 'F', 3);

        Tiger tiger = new Tiger();
        tiger.setInfo("Sher Khan", "Bengal", "Large", "Orange", 'M', 5);


        System.out.println(dog);
        System.out.println(cat);
        System.out.println(tiger);

        System.out.println("---------------------------------------------------- ");

        dog.eat();
        dog.drink();
        dog.sleep();

        cat.eat();
        cat.drink();
        cat.sleep();

        tiger.eat();
        tiger.drink();
        tiger.sleep();

        System.out.println("---------------------------------------------------- ");

        dog.bark();
        //  cat.bark();
        //    tiger.bark();

        cat.meow();
        //   dog.meow();
        //    tiger.meow();

        tiger.hunt();
        //  dog.hunt();
        //   cat.hunt();

        System.out.println("---------------------------------------------------- ");
/*
        System.out.println(dog.name);
        System.out.println(dog.color);

        dog.gender = 'K';
        dog.age = -100;

 */

        System.out.println(dog.getName());
        System.out.println(dog.getColor());

        dog.setGender('M');
        dog.setAge(3);

        System.out.println(dog);


    }
}
