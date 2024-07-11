package day04_concatenation;

public class PrimitiveTypeCastings {
    public static void main(String[] args) {

        //------ Implicit Casting -------

        byte a = 15;
        short b = a;
        //short b = (short)a
        System.out.println(b);
        int c = b;

        long d = 3000L;
        float f = d;
        System.out.println(f);

        //------ Explicit Casting -------

        int x = 100;
        byte y = (byte)x;
        System.out.println("y = " + y);

        float z = 20.8f;
        short q = (short)z;
        System.out.println("q = " + q);

        double num1 = 2.5;
        byte num2 = (byte)num1;
        System.out.println("num2 = " + num2);

        System.out.println("------------------------------------------------------------");

        int sum = 500;
        byte result = (byte)sum;
        System.out.println("result = " + result);

        int r1 = 50000;
        short r2 = (short)r1; // value range is less than r1
        System.out.println("r2 = " + r2);

        System.out.println("------------------------------------------------------------");

        double myNum1 = 123.456;        // explicit casting
        int myNum2 = (int)myNum1;
        System.out.println(myNum2);

        int myNum3 = 3432;
        double myNum4 = myNum3;         // implicit casting
        System.out.println(myNum4);












    }
}
