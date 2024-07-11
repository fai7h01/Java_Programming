package day08_ternaries_switch;

public class SwitchIntro3 {
    public static void main(String[] args) {

        int score = 90;

        String result = "";

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
        //============================================================\

        int number = 8;

        String month = "";

        switch (number){
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "Octomber";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
                break;
            default:
                month = "Invalid";

        }
        System.out.println(month);



    }
}
