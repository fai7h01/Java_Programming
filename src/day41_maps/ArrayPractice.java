package day41_maps;

import java.util.*;

public class ArrayPractice {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3,4,5,6));

        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(10,20,30,40,50,60));

        List<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(80,50,350,430,510,165));

        List<Integer>[] arrayOfLists = new List[3];

        arrayOfLists[0] = list1;
        arrayOfLists[1] = list2;
        arrayOfLists[2] = list3;

        System.out.println(Arrays.asList(arrayOfLists));

        arrayOfLists[0].set(4, 777);

        System.out.println(Arrays.asList(arrayOfLists));

        System.out.println("--------------------------------------------------");

        Set<Integer>[] arrayOfSets = new Set[5];

        arrayOfSets[0] = new LinkedHashSet<>(Arrays.asList(10,10,10,20,30));
        arrayOfSets[1] = new TreeSet<>();
        arrayOfSets[2] = new LinkedHashSet<>();
        arrayOfSets[3] = new LinkedHashSet<>();
        arrayOfSets[4] = new HashSet<>();

        arrayOfSets[2].addAll(Arrays.asList(1,2,3,4,5));
        arrayOfSets[4].addAll(Arrays.asList(11,22,33,44,55));
        arrayOfSets[1].addAll(Arrays.asList(9,0,1,2,6,4,3,7,8));

        System.out.println(Arrays.toString(arrayOfSets));



    }
}
