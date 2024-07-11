package day38_exceptions.shapeTask;

public class Square extends Shape{
    private double side;

    public Square(double side){
        setSide(side);
    }

    public double getSide(){
        return side;
    }
    public void setSide(double side){
        if (side <= 0){
            throw new IllegalArgumentException("Square side can not be zero or negative");
        }
        this.side = side;
    }

    @Override
    public double area() {
        return getSide() * getSide();
    }

    @Override
    public double perimeter() {
        return 4 * getSide();
    }
}
