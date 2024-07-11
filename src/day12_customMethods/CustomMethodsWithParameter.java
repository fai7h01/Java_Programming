package day12_customMethods;

public class CustomMethodsWithParameter {

    public static void main(String[] args) {

        oddOrEven(58);

        System.out.println("---------------------");

        oddOrEven(10000);

        eligibilityCheck(11);

        oddEvenOrZero(0);

        grade(45);

        int num1 = 100;
        oddOrEven(num1);

        int num2 = 35;
        oddOrEven(num2);

        int num3 = 70;
        oddOrEven(num3);

        int num4 = 39;
        oddOrEven(num4);


    }

    // the  method takes an arguement number, and verifies if the number is odd or even number
    public static void oddOrEven(int num){
        if (num % 2 == 0){
            System.out.println(num + " is even number");
        }else {
            System.out.println(num + " is odd number");
        }
    }

    public static void eligibilityCheck(int age){
        if (age >= 21){
            System.out.println("Is eligible");
        }else {
            System.out.println("Not eligible");
        }
    }

    public static void oddEvenOrZero(int number){
        if (number == 0){
            System.out.println("zero");
        } else if (number % 2 == 0) {
            System.out.println("even");
        }else {
            System.out.println("odd");
        }
    }

    public static void grade(int score){
        if (score > 90){
            System.out.println("A");
        }else if (score > 80){
            System.out.println("B");
        } else if (score > 70) {
            System.out.println("C");
        } else if (score > 60) {
            System.out.println("Passed");
        }else {
            System.out.println("Failed");
        }
    }

}
