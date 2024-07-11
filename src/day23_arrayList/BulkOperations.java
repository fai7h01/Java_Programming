package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        list1.addAll(1, numbers);

        System.out.println(list1);


        System.out.println("------------------------------------------------");

        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll(Arrays.asList(15, 20, 25, 30, 35, 40, 45)); // by default its passed as an array, so we need asList() method to covert it to list
        System.out.println("scores = " + scores);

        System.out.println("------------------------------------------------");

        ArrayList<String> students = new ArrayList<>();
        students.addAll(Arrays.asList("Luka", "Steve", "Nolan"));
        System.out.println("students = " + students);

        students.addAll(2, Arrays.asList("Lesley", "Miya", "Eudora"));
        System.out.println("students = " + students);

        System.out.println("------------------------------------------------");

        Integer[] nums = {1, 2, 3, 4, 5, 6};
        ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(nums));
        // l1.addAll(Arrays.asList(nums));

        System.out.println(l1);

        System.out.println("------------------------------------------------");

        ArrayList<String> employeesList = new ArrayList<>();
        employeesList.addAll(Arrays.asList("Alexa", "Dave", "Blake", "Nolan", "Muhtar", "Ali"));

        System.out.println("employeesList = " + employeesList);

        boolean hasAlexa = employeesList.contains("Alexa");

        boolean hasDaveAndNolan = employeesList.containsAll(Arrays.asList("Dave", "Nolan"));

        boolean hasLukaAndAli = employeesList.containsAll(Arrays.asList("Luka", "Muhtar", "Ali"));

        System.out.println("hasAlexa = " + hasAlexa);
        System.out.println("hasDaveAndNolan = " + hasDaveAndNolan);
        System.out.println("hasLukaAndAli = " + hasLukaAndAli);

        System.out.println("------------------------------------------------");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10, 10, 20, 30, 40, 50, 60, 70, 10, 10, 10, 20, 20, 20));

        list.removeAll(Arrays.asList(10, 20));

        System.out.println("list = " + list);

        System.out.println("------------------------------------------------");

        ArrayList<String> developers = new ArrayList<>();
        developers.addAll(Arrays.asList("Alena","Muhtar","Gadir","Muhtar","Luka","Nolan"));

        developers.retainAll(Arrays.asList("Luka","Muhtar","Nolan"));

        System.out.println("developers = " + developers);

        System.out.println("------------------------------------------------");

        ArrayList<String> groceriesList = new ArrayList<>();
        groceriesList.addAll(Arrays.asList("Eggs","Milk","Potato","Tomato","Rice","Orange","Strawberry","Blueberry","Paper towels"));

        System.out.println(groceriesList.retainAll(Arrays.asList("Eggs","Potato","Milk","Blueberry"))); // will stay and rest of them will be removed
        //6System.out.println(groceriesList.removeAll(Arrays.asList("Eggs","Rice","Orange","Potato","Tomato")));

        System.out.println("groceriesList = " + groceriesList);


    }
}
