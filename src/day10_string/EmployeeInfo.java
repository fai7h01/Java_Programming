package day10_string;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class EmployeeInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your full name:");
        String name = scan.nextLine();

        System.out.println("Enter your age:");
        int age = scan.nextInt();

        System.out.println("Enter your gender");
        char gender = scan.next().charAt(0);

        scan.nextLine();
        System.out.println("Enter your company name:");
        String coName = scan.nextLine();

        System.out.println("Enter your job title:");
        String job = scan.nextLine();

        System.out.println("Enter your salary:");
        double salary = scan.nextDouble();

        System.out.println("Employee's name: " + name);
        System.out.println("Employee's age: " + age);
        System.out.println("Employee's gender: " + gender);
        System.out.println("Company name: " + coName);
        System.out.println("Employee's job title: " + job);
        System.out.println("Employee's salary: $" + salary);


        scan.close();
    }
}
/*
2. Create a class named EmployeeInfo and Ask the user to:
	        2.1 Enter your full name ( nextLine() )
	        2.2 Enter your age ( nextByte())
	        2.3 Enter your gender ( next().charAt(0) )
	        2.4 Enter your company name ( nextLine() )
	        2.5 Enter your job title ( nextLine() )
	        2.6 Enter your salary (nextDouble() )

	        Display:
	            Employee's name
	            EMployee's age
	            Employee's gender
	            Company name
	            Employee's job title
	            Employee's salary
 */