package day05_operators;

public class LogicalOperators {
    public static void main(String[] args) {

        double salary = 60000;
        int crediScore = 650;
        int age = 42;

        boolean eligibleForLoan = salary >= 30000 && crediScore >= 650 && age >= 18;
        //                        true          true         true \\ if false ==>  false
        System.out.println(eligibleForLoan);

        System.out.println("----------------------------------------------------");

        age = 18;
        String country = "USA";

        boolean eligibleForVote = age >= 18 && country == "USA";
        //                          true      &&     true
        System.out.println(eligibleForVote);

        System.out.println("----------------------------------------------------");

        String answer = "maybe"; //if answer = no ==> true

        boolean validAnswer = answer == "yes" || answer == "no";

        System.out.println(validAnswer);

        String grade = "B";

        boolean passedExam = grade == "A" || grade == "B"|| grade == "C" || grade == "D";

        System.out.println(passedExam);

        System.out.println("----------------------------------------------------");

        System.out.println(!false);

        String a = "yes";
        boolean yes = a == "yes";
        boolean no = !yes;
        System.out.println("yes = " + yes);
        System.out.println("no = " + no);

        System.out.println("----------------------------------------------------");

        int score = 69;

        boolean passed = score >= 60;
        boolean failed = !passed;
        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);

        System.out.println("----------------------------------------------------");

        System.out.println(true == !false && false != true && true != !true); // true





    }
}
