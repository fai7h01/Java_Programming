package day35_polymorphism.trasnportationTask;

public class Tesla extends Car implements Electric, AutoPilot{
    public Tesla(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

    @Override
    public void charge() {

    }

    @Override
    public void transportPeople() {

    }

    @Override
    public void start() {

    }

    @Override
    public void autoPark() {

    }

    @Override
    public void selfDrive() {

    }
}
