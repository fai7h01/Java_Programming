package day07_ifStatements;

public class GradeReport {
    public static void main(String[] args) {

        int score = 97;
        String result = "";

        if (score >= 0 && score <= 100){
            if (score > 90){
                result = "A";
            } else if (score > 80) {
                result = "B";
            }else if (score > 70){
                result = "C";
            } else if (score > 60) {
                result = "D";
            }else {
                result = "F";
            }
        }else {
            System.err.println("Invalid");
        }
        System.out.println(result);



    }
}
/*
1. Create a class named GradeReport.java
2. An integer variable named score is declared and given, Write a
program that can print the grade of the student.
(only if the given score is a valid score, then print the name of the
month. Otherwise print Invalid)
Ex:
score = 95
output:
Your grade is A
 */
