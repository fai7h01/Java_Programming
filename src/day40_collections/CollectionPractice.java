package day40_collections;

import java.util.*;

public class CollectionPractice {
    public static void main(String[] args) {

        Collection<Integer> collection = new ArrayList<>();
        collection.add(100);
        collection.addAll(Arrays.asList(100, 200, 300, 100, 100, 300, 400, 400, 500, 700));

        System.out.println(collection);

        System.out.println(((ArrayList)collection).get(2));

       // System.out.println(((Stack)collection).pop()); // classCastException, because arraylist and stack does not have IS A relationship

        System.out.println("--------------------------------------------------------------");

        Collection<Integer> collection2 = new HashSet<>();
        collection2.addAll(Arrays.asList(100, 200, 300, 100, 100, 300, 400, 400, 500, 700, 100, 100, 100, 700));

        System.out.println(collection2);

       // System.out.println(((ArrayList)collection2).get(4)); // exception

        System.out.println(new ArrayList<>(collection2).get(4));

        List<Integer> list = new ArrayList<>(collection2);


    }
}
