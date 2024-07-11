package day09_scanner;

import java.util.Scanner;

public class NextLineMethodPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // EnterEnter

        System.out.println("Enter your full name:");
        String fullName = input.nextLine(); // Luka varsimashvili + Enter

        System.out.println("Enter your school name:");
        String schoolName = input.nextLine(); // Cydeo School + Enter

        System.out.println("Enter your gender:");
        String gender = input.next(); // Male + Enter but Enter is left is scanner because next() method only reads 1 word

        System.out.println("Enter your age:");
        int age = input.nextInt(); // 23 + Enter ==> Enter is still left in Scanner

        input.nextLine(); // clear out the scanner
        // we have to give extra nextLine() method if we are using a nextLine() method after the other methods of scanner

        System.out.println("Enter your street name");
        String address = input.nextLine();

        input.close();






    }
}
