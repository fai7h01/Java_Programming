package day23_arrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        array[0] = 100;
        System.out.println(Arrays.toString(array));

        System.out.println("------------------------------------------");

        // add()
        ArrayList<String> groceriesList = new ArrayList<>();
        groceriesList.add("Eggs");
        groceriesList.add("Paper towels");
        groceriesList.add("Apples");
        groceriesList.add("Cooking oil");

        System.out.println(groceriesList);

        //groceries[2] = "Oranges";

        // set()
        groceriesList.set(2, "Oranges"); // to update an element
        System.out.println(groceriesList);

        groceriesList.add(2, "Milk"); // add an element at specified index
        System.out.println(groceriesList);

        // remove()
        groceriesList.remove(0);
        groceriesList.remove("Milk");
        System.out.println(groceriesList);

        System.out.println("-----------------------------------------------");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10); // 1
        numbers.add(20); // 2
        numbers.add(30); // 3
        numbers.add(40); // 4
        numbers.add(50); // 5

        boolean r1 = numbers.remove(Integer.valueOf(20));
        System.out.println(numbers);
        System.out.println(r1);

        System.out.println("-----------------------------------------------");

        numbers.clear();
        System.out.println(numbers);
        System.out.println(numbers.size());

        System.out.println("-----------------------------------------------");

        ArrayList<String> heroes = new ArrayList<>();
        heroes.add("Beatrix");
        heroes.add("Martis");
        heroes.add("Martis");
        heroes.add("Lesley");
        heroes.add("Xavier");
        heroes.add("Yin");

        // indexOf(), lastIndexOf()
        System.out.println(heroes.indexOf("Martis")); // first occurrence
        System.out.println(heroes.lastIndexOf("Martis"));

        System.out.println(heroes.lastIndexOf("Lesley"));

        boolean hasLayla = heroes.contains("Layla");
        boolean hasYin = heroes.contains("Yin");

        System.out.println("hasLayla = " + hasLayla);
        System.out.println("hasYin = " + hasYin);

        System.out.println("-----------------------------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = list1;

        list1.add(10);
        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);

        System.out.println(list1 == list2);

        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(20);
        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(20);

        // equals() ===> should be same elements same order
        System.out.println("l1 = " + l1);
        System.out.println("l2 = " + l2);

        System.out.println(l1.equals(l2)); // true ===> same elements different objects
        System.out.println(l1 == l2); // false ===> not same objects

        System.out.println("-----------------------------------------------");

        ArrayList<Integer> n1 = new ArrayList<>();
        n1.add(10);
        n1.add(20);
        n1.add(30);

        ArrayList<Integer> n2 = new ArrayList<>();
        n2.add(30);
        n2.add(10);
        n2.add(20);

        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);

        System.out.println(n1.equals(n2)); // false ===> different order

        // isEmpty()
        n1.clear();
        //n2.clear();
        System.out.println(n1.isEmpty());
        System.out.println(n2.isEmpty());









    }
}
