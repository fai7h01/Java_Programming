package day16_nestedLoop;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String u, p;

        int attempts = 3;

        do {
            System.out.println("Enter your username:");
            u = input.next();
            System.out.println("Enter your password:");
            p = input.next();
            attempts--;
            if (attempts == 0){
                System.err.println("Account blocked");
                break;
            }
        }while(!(u.equals("Cydeo") || p.equals("WoodenSpoon"))); // while credentials are invalid



    }
}
