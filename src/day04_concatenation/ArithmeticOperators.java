package day04_concatenation;

public class ArithmeticOperators {
    public static void main(String[] args) {
        System.out.println(100 + 122); // addition
        System.out.println(5 - 12); // subtraction

        // division
        System.out.println(20 / 6); // int / int ===> int value
        System.out.println(20 / 6.0); // int / double ===> double
        System.out.println(20.0 / 6); // double / int ===> double
        System.out.println(20.0 / 5.3); // double / double ===> double

        System.out.println(20d / 7);
        System.out.println((int) (2.5 / 0.5) );

        // Multiplication
        System.out.println(10 * 2);
        System.out.println(23.5 * 4);

        // remainder: numerator - (denominator * integer result)
        System.out.println(20 % 6);
        System.out.println(100 % 13);



    }
}
