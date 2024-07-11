package day06_ifStatements;

public class SingleIfStatementPractice {
    public static void main(String[] args) {

        int number = 100;

        boolean isEven = number % 2 == 0;
        boolean isOdd = !isEven;

        if(isEven){
            System.out.println(number + " is even");
        }
        if(isOdd){
            System.out.println(number + " is odd");
        }

        System.out.println("-------------------------------");

        if ( number % 2 == 0){
            System.out.println("Even number");

        }
        if ( number % 2 != 0){
            System.out.println("Odd number");
        }

    }
}
