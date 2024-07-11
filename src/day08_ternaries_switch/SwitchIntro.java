package day08_ternaries_switch;

public class SwitchIntro {
    public static void main(String[] args) {

        char grade = 'Q';
        String result;

        switch (grade){
            case 'A':
                result = "Excellent";
                break;
            case 'B':
                result = "Great Job";
                break;
            case 'C':
                result = "Good";
                break;
            case 'D':
                result = "Passed";
                break;
            default:
                result = "Invalid";
        }

        System.out.println(result);


    }
}
