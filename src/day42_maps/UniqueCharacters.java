package day42_maps;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueCharacters {
    public static void main(String[] args) {

        String str = "aabcccdeeeef";
        Map<Character, Integer> map = new LinkedHashMap<>();

       /* int len = str.length();
        for (int i = 0; i < len; i++) {
            int frequency = 0;
            char each = str.charAt(i);
            for (int j = 0; j < len; j++) {
                if (each == str.charAt(j)){
                    frequency++;
                }
            }
            if (frequency == 1){
                result.put(each,frequency);
            }
        }
        System.out.println(result);*/

        for (String each : str.split("")){
            int frequency = Collections.frequency(Arrays.asList(str.split("")), each);
            if (frequency == 1){
                map.put(each.charAt(0), frequency);
            }
        }

        System.out.println(map);


    }
}
/*
2. Write a program that can find the unique characters from a String
	              Not: MUST use map
	            Ex:
	                    str = "aabcccdeeeef";

	            output:
	                    {b=1, d=1, f=1}
 */