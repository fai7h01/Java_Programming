package day13_customMethods;

public class ReturnMethodIntro {
    public static void main(String[] args) {
        //int total = sum(30,15);  sum() is void method, does not return any data

        int sum = addition(10, 15); // 25
        int area = square(15); // 225

        System.out.println(sum);
        System.out.println(area);

        int volume = cube(15);
        System.out.println(volume);

    }

/*    public static void sum(int num1, int num2){
        int result = num1 + num2;
        System.out.println(result);
    }
 */

    public static int addition(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

    public static int square(int num){
        int square = num * num;
        return square;
    }

    public static int cube(int num){
        int cube = square(num) * num;
        return cube;
    }


}
