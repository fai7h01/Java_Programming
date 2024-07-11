package day07_ifStatements;

public class MonthName {
    public static void main(String[] args) {

        int number = 11;
        String result = "";

        if (number > 0 && number <= 12){
            if (number == 1){
                result = "January";
            } else if (number == 2) {
                result = "February";
            }else if (number == 3) {
                result = "March";
            }else if (number == 4) {
                result = "April";
            }else if (number == 5) {
                result = "May";
            }else if (number == 6) {
                result = "June";
            }else if (number == 7) {
                result = "July";
            }else if (number == 8) {
                result = "August";
            }else if (number == 9) {
                result = "September";
            }else if (number == 10) {
                result = "Octomber";
            }else if (number == 11) {
                result = "November";
            }else if (number == 12) {
                result = "December";
            }
        }else {
            System.out.println("Invalid");
        }
        System.out.println(result);



    }
}
/*
1. Create a class named MonthName.java
2. An integer variable named number is declared and given, Write a
program that can print the name of the month that the number
represents. (only if the given number is a valid number, then print the
name of the month. Otherwise print Invalid)
Ex:
Given:
number = 10
output:
October
 */