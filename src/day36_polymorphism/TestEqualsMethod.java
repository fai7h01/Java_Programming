package day36_polymorphism;

public class TestEqualsMethod {
    public static void main(String[] args) {

        Circle circle1 = new Circle(5);

        Circle circle2 = new Circle(5);

        Circle circle3 = new Circle(15);

        System.out.println(circle1 == circle2); // false

        System.out.println(circle1.equals(circle2)); // true

        System.out.println(circle1.equals(circle3)); // false

        System.out.println("-----------------------------------------------------------");

        IPhone iphone1 = new IPhone("iPhone 15","Base","Black",899);
        IPhone iPhone2 = new IPhone("iPhone 15","Base","Black",899);
        IPhone iPhone3 = new IPhone("iPhone 15","Base","Blue",899);

        System.out.println(iphone1.equals(iPhone2));
        System.out.println(iphone1.equals(iPhone3));

    }
}
