package day09_scanner;

import java.util.Scanner;

public class CheckEligibility {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = input.nextInt();

        String result = (age >= 21)? "Eligible to buy alcohol" : "Not eligible to buy alcohol";
        System.out.println(result);

        input.close();




    }

}
