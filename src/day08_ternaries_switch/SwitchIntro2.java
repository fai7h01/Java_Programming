package day08_ternaries_switch;

public class SwitchIntro2 {
    public static void main(String[] args) {

        int n = 5;

        String result = "";

        switch (n){
            case 1:
                result = "Monday";
                break;
            case 2:
                result = "Tuesday";
                break;
            case 3:
                result = "Wednesday";
                break;
            case 4:
                result = "Thursday";
                break;
            case 5:
                result = "Friday";
                break;
            case 6:
                result = "Saturday";
                break;
            case 7:
                result = "Sunday";
                break;
            default:
                result = "Invalid";
        }

        System.out.println(result);


    }
}
