package day17_customClass;

public class TestDogObjects {
    public static void main(String[] args) {

        Dog dog1 = new Dog();

        dog1.name = "Benny";
        dog1.breed = "German Shepherd";
        dog1.gender = 'M';
        dog1.size = "Large";
        dog1.age = 6;
        dog1.color = "Black and yellow";

        Dog dog2 = new Dog();

        dog2.name = "Loki";
        dog2.breed = "Golden retriever";
        dog2.gender = 'F';
        dog2.age = 2;
        dog2.size = "Medium";
        dog2.color = "yellow";

        Dog dog3 = new Dog();
        dog3.setInfo("Max","Chow chow",'F',8,"Small","Yellow");

        Dog dog4 = new Dog();
        dog4.setInfo("Chuck","Bulldog", 'M',5,"Small","White");

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
        System.out.println(dog4);

        dog3.eat();
        dog1.eat();
        dog1.drink();

    }

}
