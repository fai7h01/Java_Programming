package day38_exceptions.shapeTask;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        setRadius(radius);
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        if (radius <= 0){
            throw new InvalidShapeException("Circle radius can not be zero or negative");
        }
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * (getRadius() * getRadius());
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * getRadius();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
