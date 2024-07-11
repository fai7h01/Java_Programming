package day32_finalKeyword.carTask_methodOverriding;

public class Bmw extends Car{
    public Bmw(String model, String color, int year, double price) {
        super(model, color, year, price);
    }
    public void start(){
        System.out.println("Call the mechanic or jump start to start " + getMake() + " " + getModel());
    }
}
/*
4. BMW
                	start(): "Call the mechanic or jump start "

 */