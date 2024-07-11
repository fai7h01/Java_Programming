package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,3,7,8,4,6,9,0,1));

        int max = Collections.max(list);
        int min = Collections.min(list);

        System.out.println("min = " + min);
        System.out.println("max = " + max);

        System.out.println("--------------------------------------------------------");

        ArrayList<String> items = new ArrayList<>();
        items.addAll(Arrays.asList("Eggs","Milk","Potato","Tomato","Rice","Orange","Strawberry","Blueberry","Paper towels"));

        Collections.sort(items);

        System.out.println(items);

        System.out.println("--------------------------------------------------------");

        Collections.reverse(items);

        System.out.println(items);

        System.out.println("--------------------------------------------------------");

        ArrayList<String> heroes = new ArrayList<>(Arrays.asList("Wanwan","Bruno","Miya","Beatrix"));

        System.out.println(heroes);

        Collections.swap(heroes,0,1);

        System.out.println(heroes);

        Collections.swap(heroes,0,heroes.size()-1);

        System.out.println(heroes);

        System.out.println("--------------------------------------------------------");

    }
}
