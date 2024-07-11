package day27_accessModifiers;

public class Circle {

    public double radius, diameter;
    public static double pi = 3.14;

    public Circle(double radius) {
        this.radius = radius;
        diameter = radius * 2;
    }

   /* public static double calcAre(double radius){ // static only accepts statics
        this.radius = radius;
        diameter = radius * 2;
    }
    */
    public double calcArea(){
        return pi * (radius * radius);
    }

    public double calcPerimeter(){
        return pi * diameter;
    }

    public static void printPI(){
        System.out.println("PI =  " + pi);
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", PI = " + pi +
                ", Area = " + calcArea() +
                ", Perimeter = " + calcPerimeter() +
                '}';
    }
}

