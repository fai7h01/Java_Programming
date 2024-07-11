package day14_forLoop;

public class ForLoopPractice {
    public static void main(String[] args) {

        for (int i = 10; i > 0; i--) {
            System.out.println("Java");
        }

        System.out.println("------------------------------------------");

        // sum of all numbers 1 - 100
        int sum = 0;
        for (int i = 1; i <= 100 ; i++) {
            sum += i;
        }
        System.out.println(sum);

        System.out.println("---------------------------------------------------");

        // print all the characters A - Z
        for(char i = 'A'; i <= 'Z'; i++ ){
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("---------------------------------------------------");

        // print all the alphabet backwards
        for(char i = 90; i >= 65; i--){
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("I love Java");



    }
}