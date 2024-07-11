package day11_string;

import java.util.Scanner;

public class DigitLetterSpecialChar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the word:");
        String word = input.next();

        if (word.length() >= 1){
            char f = word.charAt(0);
            if (f >= '0' && f <= '9'){
                System.out.println("First character is digit");
            } else if (f >= 'a' && f <= 'z') {
                System.out.println("first character is lowercase");
            } else if (f >= 'A' && f <= 'Z') {
                System.out.println("First character is uppercase");
            }else {
                System.out.println("First character is special symbol");
            }
        }else {
            System.out.println("Empty string");
        }

        input.close();

    }
}
/*
3. Create a class named DigitLetterSpecialChar and write a program that can ask the user to enter a word
	        - if the word starts with digits, print "first character is digit"
	        - if the word starts with uppercase letters, print "first character is lowercase letter"
	        - if the word starts with lowercase letters, print "first character is uppercase letter"
	        - if the word starts with special characters, print "first character is special character"


        	HINT: You need to check the ascii table
 */