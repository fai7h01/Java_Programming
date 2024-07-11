package day19_array;

public class MinNumber {
    public static void main(String[] args) {

        int[] numbers = {200,-54,230,43,1,0,-34};

        int min = numbers[0]; // assume that min number is first element

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min){ // compares the element of the array with current minimum number
                min = numbers[i];
            }
        }
        System.out.println("min = " + min);


    }
}
