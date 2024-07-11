package day26_statics;

public class TestCarObjects {
    public static void main(String[] args) {

        Car car1 = new Car("Ford");

        System.out.println( car1 );


        Car car2 = new Car("BMW","Z8");

        System.out.println(car2);


        Car car3 = new Car("Audi","A8",2016);

        System.out.println(car3);


        Car car4 = new Car("Mercedes", "E-Class", 2019, 30000);

        System.out.println(car4);


        Car car5 = new Car("Ferrari", "Roma", 2020, 250000, "Red");

        System.out.println(car5);


    }
}
