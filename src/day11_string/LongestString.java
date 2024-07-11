package day11_string;

import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter two strings:");
        String str1 = input.nextLine();
        String str2 = input.nextLine();

        if (str1.length() > str2.length()){
            System.out.println(str1 + " is bigger");
        } else if (str1.length() < str2.length()) {
            System.out.println(str2 + " is bigger");
        }else {
            System.out.println("Equal");
        }

        input.close();

    }
}
/*
	1. Create a class named LongestString
			1.1 Ask the user to enter two strings
			1.2 Write a program that can print the longest string,
			if both have the same number of characters then print "Equal"
 */