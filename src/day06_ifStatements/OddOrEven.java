package day06_ifStatements;

public class OddOrEven {
    public static void main(String[] args) {

        int number = 545;
        boolean isEven = number % 2 == 0; // checks if given number is even
        boolean isOdd = !isEven; // checks if it's odd

        System.out.println(number + " is an even number: " + isEven);
        System.out.println(number + " is an odd number: " + isOdd);




    }
}
/*
1. Create a class named OddOrEven, and write a program that can identify if the given number is odd or even
			Ex:
				number = 20

			output:
				20 is an even number: true
				20 is an odd number: false

		Hint: even numbers are the numbers that are evenly divisible by 2 (the remainder is zero)
 */
