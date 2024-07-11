package day13_customMethods;

public class ReturnStatement {

    public static void main(String[] args) {

        eligible(25);
        int square = multiplication(5,6);
        System.out.println(square);
        System.out.println("-------------------------------------");

        System.out.println("Test started");
        boolean exit = true;
        if (exit){
            return; // terminates main method
        }
        System.out.println("Test completed");

        System.out.println("Test 2 started");

    }

    public static void eligible(int age){
        if (age < 0 || age > 150){
            System.out.println("Invalid age " + age);
            return; // exits the method
            // if the age is invalid, then this method gets terminated
        }
        if (age >= 21){
            System.out.println("You are eligible to buy alcohol");
        }else {
            System.out.println("Not eligible to buy alcohol");
        }
    }

    public static int multiplication(int n1, int n2){
        int result = n1 * n2;
        return result; // returns value when exiting method
    }




}
