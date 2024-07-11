package day12_customMethods;

import java.util.Scanner;

public class FormatFullName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name:");
        String firstName = input.nextLine().trim().replace(" ","");
        firstName = firstName.toUpperCase().charAt(0) + firstName.substring(1).toLowerCase();

        System.out.println("Enter your last name:");
        String lastName = input.nextLine().trim().replace(" ","");
        lastName = lastName.toUpperCase().charAt(0) + lastName.substring(1).toLowerCase();

        System.out.println(firstName + " " + lastName);

        input.close();

    }
}
/*
	1. Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)

	                    input:
	                        firstName = "cyDEo"
	                        lastName = "SCHOOL";

	                    output:
	                        Cydeo School
 */
