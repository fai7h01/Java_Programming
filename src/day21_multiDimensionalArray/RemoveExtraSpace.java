package day21_multiDimensionalArray;

import java.util.Arrays;

public class RemoveExtraSpace {
    public static void main(String[] args) {
        String str = "  Hello world      I      love      Java    ";

        String[] words = str.split(" ");
        str = "";

        for (String each : words) {
            if (!each.isEmpty()){
                str += each + " ";
            }
        }
        str = str.trim();// to remove last space
        System.out.println(str);

    }
}
/*
	1. Write a program that can remove all the extra space from string
			Ex:
				str = "  Hello world      I      love      Java    "

        	Output:
        		Hello world I love Java
 */