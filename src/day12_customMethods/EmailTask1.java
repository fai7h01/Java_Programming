package day12_customMethods;

import java.util.Scanner;

public class EmailTask1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your email:");
        String email = input.next();

        String firstName = email.substring(0,email.indexOf("_")).toLowerCase();
        String lastName = email.substring(email.indexOf("_")+1,email.indexOf("@")).toLowerCase();
        String underScore = email.substring(email.indexOf("_"),email.indexOf("_")+1);
        String domain = email.substring(email.indexOf("@"));

        String reverseEmail = lastName + underScore + firstName + domain;
        System.out.println(reverseEmail);

        input.close();
    }
}
/*
 2. Create a class calledEmailTask1.
       Assume that email address is constructed by person's first name and followed by an underscore and last name.

        Write a program that can swap first name with last name in the email (Saperated by an underscore).
        If the email doesn't contain an underscore print the given input email.

            Ex:
                input: mike_tyson@gmail.com
                output: tyson_mike@gmail.com

 */