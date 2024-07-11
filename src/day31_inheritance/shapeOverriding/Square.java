package day31_inheritance.shapeOverriding;

public class Square extends Shape{
    private double side;

    public Square(double side) {
        // super(); ==> its done implicitly when super class has default constructor
        setSide(side);
    }
    public double getSide(){
        return side;
    }
    public void setSide(double side){
        this.side = side;
    }

    public double area(){
        return side * side;
    }
    public double perimeter(){
        return 4 * side;
    }
    public void draw(){
        super.draw();
        System.out.println("\t*  *  *  *  *  *");
        for (int i = 0; i < 4; i++) {
            System.out.println("\t*              *");
        }
        System.out.println("\t*  *  *  *  *  *");
    }

    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + getName() + '\'' +
                "side='" + side + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
