package day20_forEach;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};
        int[] reversed = new int[array.length];

        for (int i = array.length - 1, k = 0;  i >= 0; i--) {
            reversed[k++] = array[i];
        }

        System.out.println(Arrays.toString(reversed));

        System.out.println("--------------------------------------------------------");

        String[] s1 = {"Luka","Sesili","Tatuli"};
        String[] s2 = ArraysUtility.reverse(s1);
        System.out.println(Arrays.toString(s2));

        System.out.println("--------------------------------------------------------");

        int[] nums = {100,200,300,400,500};
        nums = ArraysUtility.reverse(nums);
        System.out.println(Arrays.toString(nums));

        System.out.println("--------------------------------------------------------");

        double[] d1 = {1.5,4.6,3.5,6.7,5.5};
        d1 = ArraysUtility.reverse(d1);
        System.out.println(Arrays.toString(d1));

        System.out.println("--------------------------------------------------------");

        char[] chars = {'a','b','c','d','e'};
        chars = ArraysUtility.reverse(chars);
        System.out.println(Arrays.toString(chars));

    }
}
/*

	3. Write a program that can reverse an array of integers and returns it as new array
	        ex:
	            array = {1,2,3,4,5};

	        output:
	            reversedArray = {5,4,3,2,1};
 */