package day26_statics;

public class ConstructorCalls {

    public ConstructorCalls() {
        //this(9);
        System.out.println("Default constructor");
    }

    public ConstructorCalls(int a) {
        this();
        System.out.println("Constructor with int argument");
    }

    public ConstructorCalls(double b) {
        System.out.println("Constructor with double argument");
    }

    public ConstructorCalls(String c) {
        this(2.5);
        //this();
        System.out.println("Constructor with String argument");
    }


    public static void main(String[] args) {

        method1();

        System.out.println("----------------------------------------");

        method2();

        System.out.println("------------------------------------------------------");

        ConstructorCalls cc = new ConstructorCalls(10);

    }

    public static void method1() {
        //ConstructorCalls();
        //this();
        System.out.println("Method 1");
    }

    public static void method2() {
        method1();
        System.out.println("Method 2");
    }

}
