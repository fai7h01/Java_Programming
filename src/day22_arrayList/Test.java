package day22_arrayList;

import utilities.ArraysUtility;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        int[] numbers = {10,20,40,50,30,60,70,};
        boolean has25 = ArraysUtility.contains(numbers,25);
        System.out.println(Arrays.toString(numbers));
        System.out.println(has25);

        System.out.println("--------------------------------");

        String[] heroes = {"Lesley","Edith","Beatrix"};
        boolean hasMiya = ArraysUtility.contains(heroes,"Miya");
        System.out.println(hasMiya);

        System.out.println("--------------------------------");

        int[] arr = {10,20,30,40,40};
        int[] newArr = ArraysUtility.removeElement(arr,0);
        System.out.println(Arrays.toString(newArr));

        String[] arr1 = {"luka","Sesili","Tatuli","Margo","Benny"};
        String[] newArr1 = ArraysUtility.removeElement(arr1,3);
        System.out.println(Arrays.toString(newArr1));

        System.out.println("--------------------------------");


        int[] a1 = {10,20,30,20,30,5,7};
        int[] new_array = ArraysUtility.removeDup(a1);
        System.out.println(Arrays.toString(new_array));


    }
}
