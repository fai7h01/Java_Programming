package day20_forEach;

import utilities.ArraysUtility;
import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7};

        int[] arr3 = new int[arr1.length + arr2.length]; // to make sure that 3rd array has enough capacity to contain both array

        int k = 0; // for third arrays index number

        for (int i = 0; i < arr1.length; i++,k++) { // i: for first array's index numbers
            arr3[k] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++,k++) { // i: for second array's index numbers
            arr3[k] = arr2[i];
        }

        System.out.println(Arrays.toString(arr3));

        System.out.println("-----------------------------------------------------------");

        int[] a1 = {10,20,30,40};
        int[] a2 = {50,60,70};

        int[] a3 = ArraysUtility.merge(a1,a2);
        System.out.println(Arrays.toString(a3));

        System.out.println("-----------------------------------------------------------");

        double[] d1 = {10.5,5.5,3.5,6.5,8.5};
        double[] d2 = {20.5,15.5,13.5};

        double[] d3 = ArraysUtility.merge(d1,d2);
        System.out.println(Arrays.toString(d3));

        System.out.println("-----------------------------------------------------------");

        char[] ch1 = {'A','B','C','d','e'};
        char[] ch2 = {'X','y','Z'};

        char[] ch3 = ArraysUtility.merge(ch1,ch2);
        System.out.println(Arrays.toString(ch3));

        System.out.println("-----------------------------------------------------------");

        String[] c1 = {"Java","Pyhton","JavaScript","Ruby"};
        String[] c2 = {"C#","C++","Swift"};

        String[] c3 = ArraysUtility.merge(c1,c2);
        System.out.println(Arrays.toString(c3));


    }
}
/*
	2. write a program that can merge two arrays of integers
	        Ex:
	            arr1 = {1,2,3,4}
	            arr2 = {5,6}

	        output
	            arr3 = {1,2,3,4,5,6}
 */