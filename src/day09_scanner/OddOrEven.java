package day09_scanner;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number:");
        int num = input.nextInt();

        String odd_or_even = (num % 2 == 0)? "Even" : "Odd";
        System.out.println(odd_or_even);

        input.close();


    }
}
