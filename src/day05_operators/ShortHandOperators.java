package day05_operators;

public class ShortHandOperators {
    public static void main(String[] args) {

        int a = 20;
        System.out.println("a = " + a);
        a = 10;
        System.out.println("a = " + a);

        System.out.println("-----------------------------------");

        double balance = 100;

        balance += 1000;
        System.out.println(balance);

        balance += 5000;
        System.out.println("balance = " + balance);

        balance -= 1000;
        System.out.println("balance = " + balance);

        balance -= 3000;
        System.out.println("balance = " + balance);

        System.out.println("---------------------------------------------------------");

        double salary = 45000;

        salary *= 2;            // salary = salary * 2
        System.out.println("salary = " + salary);

        salary *= 3;
        System.out.println("salary = " + salary);

        System.out.println("---------------------------------------------------------");

        double eth = 4;

        eth *= 250;
        System.out.println("eth = " + eth);

        eth /= 2;
        System.out.println("eth = " + eth);

        System.out.println("---------------------------------------------------------");

        System.out.println("salary = " + salary);

        salary /= 2;
        System.out.println("salary = " + salary);

        System.out.println("---------------------------------------------------------");

        int num = 39;

        num %= 7;
        System.out.println("num = " + num);




    }
}
