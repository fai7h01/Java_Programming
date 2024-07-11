package day09_scanner;

import java.util.Scanner;

public class NextLine_vs_next {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = input.nextInt();

        input.nextLine(); // Enter key

        System.out.println("Enter your full name");
        String full_name = input.nextLine();

        System.out.println("age = " + age);
        System.out.println("name = " + full_name);




    }
}
