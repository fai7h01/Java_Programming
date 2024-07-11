package day12_customMethods;

public class CustomMethodsPractice {
    public static void main(String[] args) {

        maxNum(12,10);

        System.out.println("----------------------------------------");

        maxNum(50.404, 340.7);

        System.out.println("-----------------------------------------");

        maxNum(88, 88);

        System.out.println("------------------------------------------");

        initials("Luka", "Varsimashvili");

        initials("mike", "tyson");

    }

    public static void maxNum(double num1, double num2){
        if (num1 > num2){
            System.out.println(num1 + " is greater");
        }else if (num2 > num1){
            System.out.println(num2 + " is greater");
        }else {
            System.out.println("Equal");
        }
    }

    public static void initials(String firstName, String lastName){
        String initials = firstName.toUpperCase().charAt(0) + "." + lastName.toUpperCase().charAt(0);
        System.out.println("Initial is: " + initials);

    }



}
