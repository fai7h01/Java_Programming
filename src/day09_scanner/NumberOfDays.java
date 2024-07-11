package day09_scanner;

public class NumberOfDays {
    public static void main(String[] args) {

        int month = 2;
        String result = "";
        //                  Solution 1:
        if (month >= 1 && month <= 12){
            if (month == 2){
                result = "28 days";
            } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                result = "31 days";
            }else {
                result = "30 days";
            }
        }else {
            System.out.println("invalid Month");
        }
        System.out.println("result = " + result);

        System.out.println("---------------------------------------------------------");

        //          Solution 2:
        int month2 = 2;

        switch(month2){ // we cannot use boolean, float , double , long in switch statement
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                result = "31 days";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                result = "30 days";
                break;
            case 2:
                result = "28 days";
                break;
            default:
                System.out.println("Invalid month");
        }
        System.out.println(result);

    }
}
/*
 2. Create a class named NumberOfDays. An integer variable named month is given
        Use switch statement to write a program that can find the number of days in the given number of month.

                EX:
                    month = 5

                output:
                    31 days

                (Assume that February has 28 days)

            Hints:
            	Months that has 31 days: 1, 3, 5, 7, 8, 10, 12
                Months that has 30 days: 4, 6, 9, 11

 */
