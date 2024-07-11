package day15_whileLoop;

public class ContinueStatement {
    public static void main(String[] args) {

        for (int i = 1; i < 6; i++) {
            if (i == 2) {
                continue;
            }
            System.out.println(i);
        }

        System.out.println("-----------------------------------------");

        for (int i = 10; i <= 20; i++) {
            if (i % 2 == 0) { // if i is even
                continue; // skips current iteration
            }
            System.out.println(i);
        }

        System.out.println("-----------------------------------------");

        for (char i = 'A'; i <= 'G'; i++) {
            if (i == 'B' || i == 'E') {
                continue;
            }
            System.out.println(i);
        }

        System.out.println("-----------------------------------------");

       /* for (int i = 0; i < 10; i++)
            System.out.println("Hello World");
        */
        System.out.println("-----------------------------------------");

        // find the sum of all the even numbers 50 - 100
        int sum1 = 0, sum2 = 0, sum3 = 0;

        for (int i = 50; i < 101; i++) {
            if (i % 2 == 0){
                sum1 += i;
            }
        }
        System.out.println(sum1);

        for (int i = 50; i <= 100 ; i += 2) {
            sum2 += i;
        }
        System.out.println(sum2);

        for (int i = 50; i < 101; i++) {
            if (i % 2 != 0){
                continue;
            }
            sum3 += i;
            System.out.print(i + " ");
        }
        System.out.println(sum3);
    }
}
