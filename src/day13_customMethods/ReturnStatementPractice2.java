package day13_customMethods;

import java.util.Scanner;

public class ReturnStatementPractice2 {
    public static void main(String[] args) {

        int number = new Scanner(System.in).nextInt();

        /*boolean isValid = number == 1 || number == 2 || number == 3 || number == 4 || number == 5 || number == 6 || number == 7;

        if (!isValid){
            System.out.println("Invalid number");
            return;
        }
         */
        if (number < 1 || number > 7){
            System.out.println("Invalid number");
            return; // exits the main method
        }

        String day = (number == 1)? "Monday" :(number == 2)? "Tuesday" :(number == 3)? "Wednesday"
                :(number == 4)? "Thursday" :(number == 5)? "Friday" :(number == 6)? "Saturday" : "Sunday";
        System.out.println("day = " + day);

    }
}
