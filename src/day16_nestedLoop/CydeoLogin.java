package day16_nestedLoop;

import java.util.Scanner;

public class CydeoLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter username:");
        String username = input.next();

        System.out.println("Enter password:");
        String password = input.next();

        if (username.equals("Cydeo") && password.equals("WoodenSpoon")){
            System.out.println("Logged In.");
        }else{
            for (int i = 0; i < 3; i++) {
                /*
                if ( i != 2){
                    System.err.println("Incorrect username or password. Please re-enter:");
                }else {
                    System.err.println("This is your last attempt, please re-enter:");
                }
                 */
                System.err.println("Incorrect username or password. Please re-enter:");
                System.out.println("Username:");
                username = input.next();
                System.out.println("Password:");
                password = input.next();

                if (username.equals("Cydeo") && password.equals("WoodenSpoon")){ // if user enters valid credentials
                    System.out.println("You are now logged in.");
                    break; // exits loop
                }
            }
            if (!(username.equals("Cydeo") && password.equals("WoodenSpoon"))){ // after all three attempts, if the username or password is incorrect
                System.err.println("Your account now is locked, please contact with support team.");
            }
            
        }
    }

  /*  public static void cydeoLogin(String username, String password){
        if (username.equals("Cydeo") && password.equals("WoodenSpoon")){
            System.out.println("Logged in.");
        }else {
            for (int i = 0; i < 3; i++) {
                System.out.println("Incorrect username or password. Please re-enter:");
            }
        }
    }

   */

}
/*
1. Create a class named CydeoLogIn. you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                    username: Cydeo
                    password: WoodenSpoon

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."

                If the credentials are not matched, the program should allow
                the user to have three attempts to enter correct credentials

                if all three attempts are failed, then print "Your account is lucked."
 */
