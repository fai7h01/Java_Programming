package day10_string;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your full name:");
        String name = scan.nextLine();

        System.out.println("Enter your building number:");
        String buildingNum = scan.next();

        scan.nextLine();
        System.out.println("Enter your street name:");
        String streetName = scan.nextLine();

        System.out.println("Enter your city name:");
        String city = scan.nextLine();

        System.out.println("Enter your state:");
        String state = scan.nextLine();

        System.out.println("Enter your zipcode:");
        String zipcode = scan.next();

        System.out.println("Your shipping address is:\n\t" + name + "\n\t" + streetName + "\n\t" + city + ", " + state + " " + zipcode);

        scan.close();
    }
}
/*
	1. Create a class named ShippingAddress and ask the user to:
	        1.1 Enter your full name ( nextLine() )
	        1.2 Enter your building number ( next() )
	        1.3 Enter your Street name ( nextLine() )
	        1.4 Enter your city name ( nextLine() )
	        1.5 Enter your state ( nextLine() )
	        1.6 Enter your zip code ( next() )

	        1.7 Display the shipping address
	                Ex:
	                    Your shipping address is:
	                        John Smith
	                        7925 Jones Branch Dr
	                        McLean, VA 22012
 */