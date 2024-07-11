package day21_multiDimensionalArray;

import utilities.ArraysUtility;

import java.util.Arrays;

public class AddElements {
    public static void main(String[] args) {

        int[] array = {10, 20, 30, 40, 50, 60, 70, 80};
        int element = 90;

        int[] new_array = Arrays.copyOf(array,array.length+1);
        new_array[new_array.length-1] = element;

        System.out.println(Arrays.toString(new_array));

        int[] numbers = {1,2,3,4,5};
        numbers = ArraysUtility.addElement(numbers,10);
        System.out.println(Arrays.toString(numbers));


        double[] decimals = {1.5,2.5,3.5,4.5,5.5};
        decimals = ArraysUtility.addElement(decimals,10.6);
        System.out.println(Arrays.toString(decimals));


        String[] languages = {"Java","Python","C++"};
        languages = ArraysUtility.addElement(languages,"JavaScript");
        languages = ArraysUtility.addElement(languages,"C#");
        System.out.println(Arrays.toString(languages));

        char[] ch = {'a','b','c'};
        ch = ArraysUtility.addElement(ch,'d');
        System.out.println(Arrays.toString(ch));



    }
}
