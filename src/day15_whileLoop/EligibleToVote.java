package day15_whileLoop;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = input.nextInt(); // valid age 1 - 120

        while(!(age >= 1 && age <= 120)){ //  while age is not valid
            System.err.println("Invalid entry!\nEnter again:");
            age = input.nextInt();
        }

        input.nextLine();
        System.out.println("Are you a US citizen? Yes/No");
        String answer = input.nextLine().toLowerCase();

        while(!(answer.equals("yes") || answer.equals("no"))){ // while answer is invalid neither yes or no
            System.err.println("Invalid entry!\nPlease re-enter:");
            System.out.println("Are you a US citizen? Yes/No");
            answer = input.nextLine().toLowerCase();
        }

        if (age >= 18 && answer.equals("yes")){
            System.out.println("you are eligible to vote");
        }else {
            System.out.println("Not eligible to vote");
        }

        input.close();





    }
}
