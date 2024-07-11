package day22_arrayList;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10); // 0
        list.add(20); // 1
        list.add(30); // 2
        list.add(10); // 3
        //list.add(5.5);

        System.out.println(list);

        list.add(1,15);

        System.out.println(list);

        list.add(2,25);

        System.out.println(list);

        System.out.println("--------------------------------------------");

        ArrayList<String> studentsList = new ArrayList<>();
        studentsList.add("Luka");
        studentsList.add("Lesley");
        studentsList.add("Beatrix");
        studentsList.add("Yu Zhong");

        System.out.println(studentsList.size());
        System.out.println("studentsList = " + studentsList);

        System.out.println(studentsList.get(2)); // returns element

        String firstElement = studentsList.get(0);
        String lastElement = studentsList.get(studentsList.size()-1); // last element

        System.out.println("firstElement = " + firstElement);
        System.out.println("lastElement = " + lastElement);



    }
}
