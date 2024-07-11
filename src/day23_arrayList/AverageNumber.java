package day23_arrayList;

import java.util.ArrayList;

public class AverageNumber {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        int sum = 0;
        for (Integer each : list) {
           sum += each;
        }
        double average = sum / list.size();
        System.out.println(average);



    }
}
/*
2. Write a program that can find the average number from an arrayList of integers
 */