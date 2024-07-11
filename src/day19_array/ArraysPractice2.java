package day19_array;

import java.awt.font.LineMetrics;
import java.util.Arrays;

public class ArraysPractice2 {
    public static void main(String[] args) {

        int[] arr1 = new int[100];
        /*
        for (int i = 0, j = 1; i < arr1.length; i++, j++) {
            arr1[i] = j;
        }
         */
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i + 1;
        }
        System.out.println("arr1 = " + Arrays.toString(arr1));

        System.out.println("------------------------------------------");

        int[] arr2 = new int[100];
        /*
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr2.length - i;
        }
         */
        for (int i = arr2.length - 1; i >= 0; i--) {
            arr2[i] = arr2.length - i;
        }
        System.out.println("arr2 = " + Arrays.toString(arr2));

        System.out.println("--------------------------------------------------------------------------------");
        /*
        1. Write a program that can find the maximum number from an array

	    2. Write a program that can find the minimum number from an array
         */
        int[] arr3 = {15,54,63,2,34};

        System.out.println("length = " + arr3.length);

        int max = arr3[0]; // assume that first element is maximum number
        int min = arr3[0]; // assume that first element is minimum number
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] > max){
                max = arr3[i];
            }
            if (arr3[i] < min){
                min = arr3[i];
            }
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);



    }
}
