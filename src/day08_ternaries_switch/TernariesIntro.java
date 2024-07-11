package day08_ternaries_switch;

public class TernariesIntro {
    public static void main(String[] args) {

        int score = 85;
        String result;

        if (score >= 60){
            result = "Passed";
        }else {
            result = "Failed";
        }

        System.out.println("result = " + result);

        System.out.println("--------------------------------------------");

        int age = 32;
        String answer = (age >= 21) ? "Eligible" : "Not Eligible";
        System.out.println(answer);

        System.out.println("--------------------------------------------");


        int number = 35;
        boolean isDivisibleBy5;

        if (number % 5 == 0) {
            isDivisibleBy5 = true;
        }else {
            isDivisibleBy5 = false;
        }

        boolean isDivisibleBy3 = (number % 3 == 0) ? true : false;
        System.out.println(isDivisibleBy3);





    }
}
