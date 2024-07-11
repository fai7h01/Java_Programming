package day09_scanner;

import java.util.Scanner;

public class MonthName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number to choose month:");
        int number = input.nextInt();

        String monthName = (number >= 1 && number <= 12) ?
                (number == 1) ? "January" : (number == 2) ? "February" : (number == 3) ? "March"
                        : (number == 4) ? "April" : (number == 5) ? "May" : (number == 6) ? "June"
                        : (number == 7) ? "July" : (number == 8) ? "August" : (number == 9) ? "September"
                        : (number == 10) ? "Octomber" : (number == 11) ? "November" : "December" : "No such a month";

        System.out.println("Selected month: " + monthName);

        input.close();


    }
}
