package day22_arrayList;

public class MaxMinNumbersOfMultiDArray {
    public static void main(String[] args) {

        int[][] array = { {100, 20000, 300}, {10, 1000, 50}, {-200, 400, 0} }; // indexes of array: 0 - 2
        int max = array[0][0];
        int min = array[0][0];

        for (int[] eachArr : array) {
            for (int eachElement : eachArr) {
                if (eachElement > max){
                    max = eachElement;
                }
                if (eachElement < min){
                    min = eachElement;
                }
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
/*

	2. Write a program that can find the minimum and maximum numbers from a two dimensional array of integers
		Ex:
			array = { {100, 20, 300}, {10, 1000, 50}, {-200, 400, 0} };

			output:
				Minimum number is: -200
				Maximum number is: 1000

 */