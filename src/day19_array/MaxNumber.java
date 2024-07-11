package day19_array;

public class MaxNumber {
    public static void main(String[] args) {

        int[] numbers = {100,20,500,40,-10,30};

        int max = numbers[0]; // assume that max number is first element

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max){ // compares the element of the array with current maximum number
                max = numbers[i];
            }
        }
        System.out.println("max = " + max);


    }
}
