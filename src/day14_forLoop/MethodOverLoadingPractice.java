package day14_forLoop;

public class MethodOverLoadingPractice {
    public static void main(String[] args) {

        System.out.println(sum(15, 25));
        System.out.println(sum(10, -20, 30));

        System.out.println(sum(120, 54, 12, -43));

        System.out.println(sum(55.55, 99.95));
        System.out.println(sum(1.4, 2.5, 3.5));
        System.out.println(sum(20.5, 33.5, 54.65, 76.55));

        System.out.println(sum(10, 20.5));
    }

    public static int sum(int n1, int n2) {
        return n1 + n2;
    }

    public static int sum(int n1, int n2, int n3) {
        return sum(n1, n2) + n3;
    }

    public static int sum(int n1, int n2, int n3, int n4) {
        return sum(n1, n2, n3) + n4;
        //return sum(sum(n1, n2, n3), n4);
    }

    public static double sum(double n1, double n2){
        return n1 + n2;
    }

    public static double sum(double n1, double n2, double n3){
        return sum(n1,n2) + n3;
    }

    public static double sum(double b1, double b2, double b3, double b4){
        return sum(b1, b2, b3) + b4;
    }


}
