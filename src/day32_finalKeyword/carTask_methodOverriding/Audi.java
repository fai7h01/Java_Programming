package day32_finalKeyword.carTask_methodOverriding;

public class Audi extends Car{
    public Audi(String model, String color, int year, double price) {
        super(model, color, year, price);
    }
    public void start(){
        System.out.println("Press the start button to start " + getMake() + " " + getModel());
    }
}
/*
3. Audi
                	start(): "Press the start button"
 */