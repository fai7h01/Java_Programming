package day11_string;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {

        String correctUsername = "Cydeo";
        String correctPassword = "WoodenSpoon";

        Scanner input = new Scanner(System.in);

        System.out.println("Enter username:");
        String userName = input.next();
        System.out.println("Enter password:");
        String password = input.next();

        if (userName.equals(correctUsername) && password.equals(correctPassword)){
            System.out.println("You are now logged in");
        }else {
            System.out.println("Incorrect username or password");
        }

        input.close();




    }
}
/*
	2. Create a class named LogIn
			2.1 Ask the user to enter the username & password
			2.2 print "You are now logged in" If user entered valid username and password
				otherwise print the error message "Incorrect username or password. Please try again"

			Note: Assume that the valid credentials are:
						username: Cydeo
						password: WoodenSpoon
 */