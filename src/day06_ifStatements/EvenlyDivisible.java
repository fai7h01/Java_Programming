package day06_ifStatements;

public class EvenlyDivisible {
    public static void main(String[] args) {

        int number = 65;

        boolean divisibleBy2 = number % 2 == 0;
        boolean divisibleby3 = number % 3 == 0;
        boolean divisibleBy5 = number % 5 == 0;

        System.out.println(number + " is evenly divisible by 2: " + divisibleBy2);
        System.out.println(number + " is evenly divisible by 3: " + divisibleby3);
        System.out.println(number + " is evenly divisible by 5: " + divisibleBy5);




    }
}
/*
3. Create a class named EvenlyDivisible, and write a program that can check if a number is evenly divisible by 2, 3, 5
            Ex:
                number = 65;

            output:
                65 is divisible by 2: false
                65 is divisible by 3: false
                65 is divisible by 5: true

            Evenly Divisible ==> remainder is zero
 */