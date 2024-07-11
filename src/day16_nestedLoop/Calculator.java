package day16_nestedLoop;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String answer = "yes";

        while(answer.equals("yes")) { // same as while(true)

            System.out.println("Enter a number:");
            double number1 = input.nextDouble();

            System.out.println("Enter a math operator:");
            char operator = input.next().charAt(0);

            while (!(operator == '+' || operator == '-' || operator == '*' || operator == '/')) {
                System.err.println("Invalid math operator! Please re-enter:");
                operator = input.next().charAt(0);
            }

            System.out.println("Enter a second number:");
            double number2 = input.nextDouble();

            double result = (operator == '+') ? number1 + number2 : (operator == '-') ? number1 - number2
                    : (operator == '*') ? number1 * number2 : number1 / number2;
            System.out.println("result = " + result);

            System.out.println("Would you like to continue? Yes/No");
            answer = input.next().toLowerCase();

            while(!(answer.equals("yes") || answer.equals("no"))){ // while user input is invalid
                System.err.println("Invalid entry! Would you like to continue? Yes/No");
                answer = input.next().toLowerCase();
            }

            /*if (answer.equals("no")){ // if user enters no, loop will exit
                break;
            } // otherwise it will continue loop

             */

        }





    }
}
