package day34_abstraction.carTask;

public class TestCarObjects {
    public static void main(String[] args) {

       // Car car1 = new Car("X6","red",2020,45000);

        Honda honda = new Honda("Civic","Blue",2019,45000);

        Audi audi = new Audi("S8","Black",2023, 85000);

        Tesla tesla = new Tesla("Model X","Red",2022,105000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);

        System.out.println("-------------------------------------");

        honda.start();
        audi.start();
        tesla.start();

        System.out.println("-------------------------------------");

        honda.stop();
        audi.stop();
        tesla.stop();

        System.out.println("-------------------------------------");

        audi.autoPark();
        tesla.autoPilot();

    }
}
