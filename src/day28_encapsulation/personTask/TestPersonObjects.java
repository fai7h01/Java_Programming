package day28_encapsulation.personTask;

public class TestPersonObjects {
    public static void main(String[] args) {

        Person person1 = new Person("Aaron");

        Person person2 = new Person("Bobby",39);

        Person person3 = new Person("Cleo","Spanish");

        Person person4 = new Person("Dave", 'M');

        Person person5 = new Person("Emily",29, 'M');

        Person person6 = new Person("Freddy",34,'M',"English");

       // person1.planet = "Mars";
       // Person.planet = "Mars";

        System.out.println("person1 = " + person1);
        System.out.println("person2 = " + person2);
        System.out.println("person3 = " + person3);
        System.out.println("person4 = " + person4);
        System.out.println("person5 = " + person5);
        System.out.println("person6 = " + person6);

        Person.printPlanetName();

        person1.eat("french fries");

        person2.drink("water");

        person5.drink("tea");

        person6.drink("coffee");

    }

}
