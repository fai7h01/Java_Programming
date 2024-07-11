package day31_inheritance.animal_MethodOverriding;

public class TestAnimalObjects {
    public static void main(String[] args) {

        Cat cat = new Cat("Lucy","Sphinx",'F',3,"Small","Cream");

        Dog dog = new Dog("Benny","German Shepherd",'F',6,"Large","Black and yellow");

        Lion lion = new Lion("Simba","African Lion",'M',6,"Large","Yellow",true);

        Eagle eagle = new Eagle("Bella","American Eagle",'F',4,"Medium","Black & white");

        System.out.println(cat);
        System.out.println(dog);
        System.out.println(lion);
        System.out.println(eagle);

        System.out.println("--------------------------------------------------------------");

        cat.eat();
        dog.eat();
        lion.eat();
        eagle.eat();

        System.out.println("--------------------------------------------------------------");

        cat.sleep();
        dog.sleep();
        eagle.sleep();
        lion.sleep();


    }
}
