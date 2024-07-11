package day31_inheritance.shapeOverriding;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius){
        setRadius(radius);
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double area(){
        return 3.14 * (radius * radius);
    }
    public double perimeter(){
        return 2 * 3.14 * radius;
    }

    public void draw(){
        super.draw();
    }

    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + getName() + '\'' +
                "radius='" + getRadius() + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }


}
