package day07_ifStatements;

public class Grade {
    public static void main(String[] args) {

        char grade = 'A';

        String message = "";

        if (grade == 'A'){
            message = "Excellent";
        } else if (grade == 'B') {
            message = "great job";
        } else if (grade == 'C') {
            message = "good";
        } else if (grade == 'D') {
            message = "passed";
        } else if (grade == 'F') {
            message = "failed";
        }else{
            System.err.println("LOL");
        }

        System.out.println(message);

    }
}
/*
2. Create a class named Grade, and a char variable named grade is given. write a program to print the following messages:
            'A': Excellent
            'B': Great job
            'C': Good
            'D': Passed
            'F': Failed

        Note: Do not use more than one print statement
 */
