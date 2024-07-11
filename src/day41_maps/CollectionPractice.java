package day41_maps;

import day33_abstraction.employeeTask.Employee;

import java.util.*;

public class CollectionPractice {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3,4,5,6));

        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(10,20,30,40,50,60));

        List<List<Integer>> lists = new ArrayList<>();
        //lists.addAll(Arrays.asList(list1,list2));
        lists.add(list1);
        lists.add(list2);

        System.out.println(lists);

        // 40
        System.out.println(lists.get(1).get(3));

        for (List<Integer> eachList : lists){
            for (Integer eachElement : eachList) {
                System.out.println(eachElement );
            }
        }

        System.out.println("-----------------------------------------------------------------------");

        List<Set<Integer>> sets = new ArrayList<>();
        sets.add(new LinkedHashSet<>());
        sets.add(new LinkedHashSet<>());
        sets.add(new LinkedHashSet<>());
        sets.add(new LinkedHashSet<>());

        System.out.println(sets);

        sets.get(0).addAll(Arrays.asList(10,4,20));
        sets.get(1).addAll(Arrays.asList(30,44,204,23));
        sets.get(2).addAll(Arrays.asList(14,54,657,87));
        sets.get(3).addAll(Arrays.asList(1,2,3,4,5,6));

        System.out.println(sets);

        System.out.println("-----------------------------------------------------------------------");

        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7,8,9,10};

        List<int[]> listOfArrays = new ArrayList<>();
        listOfArrays.add(arr1);
        listOfArrays.add(arr2);

      //  System.out.println(listOfArrays);

        System.out.println(Arrays.toString(listOfArrays.get(0)));

        listOfArrays.get(0)[2] = 35;

        System.out.println(Arrays.toString(listOfArrays.get(0)));

        System.out.println("-----------------------------------------------------------------------");

       // List<List<Employee>> teams = new ArrayList<>();


       // List<int[][]> l = new ArrayList<>();


    }
}
