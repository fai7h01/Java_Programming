package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Array_ArrayList_Conversion {
    public static void main(String[] args) {

        String[] arr = {"A","B","C","D"};

        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));

        System.out.println("list = " + list);

        System.out.println("------------------------------------------------------------");

        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Java","Python","C#"));

        String[] langauges = list2.toArray(new String[0]);
        System.out.println(Arrays.toString(langauges));

        System.out.println("------------------------------------------------------------");

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));

        Integer[] n = nums.toArray(new Integer[0]);
        //int[] n = nums.toArray(new int[0]);

        System.out.println(Arrays.toString(n));



    }
}
