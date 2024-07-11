package day15_whileLoop;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number:");
        double n1 = input.nextDouble();

        System.out.println("Enter second number:");
        double n2 = input.nextDouble();

        System.out.println("Enter math operator:");
        char operator = input.next().charAt(0);

        while (!(operator == '+' || operator == '-' || operator == '*' || operator == '/')) {
            System.err.println("Invalid operator! Please re-enter the math operator:");
            operator = input.next().charAt(0);
        }

        double result = (operator == '+') ? n1 + n2 : (operator == '-') ? n1 - n2
                : (operator == '*') ? n1 * n2 : n1 / n2;

        System.out.println(result);

        /*
        if (operator == '+') {
            System.out.println(n1 + n2);
        } else if (operator == '-') {
            System.out.println(n1 - n2);
        } else if (operator == '*') {
            System.out.println(n1 * n2);
        } else {
            System.out.println(n1 / n2);
        }
         */

    }
}
