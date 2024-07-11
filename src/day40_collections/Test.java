package day40_collections;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(3);
        numbers.add(1);
        numbers.add(6);
        numbers.add(0);

        numbers.remove(Integer.valueOf(1));

        System.out.println(numbers);


    }
}
