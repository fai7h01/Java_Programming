package day23_arrayList;

import java.util.ArrayList;

public class RemoveDuplicates {
    public static void main(String[] args) {

        ArrayList<String> heroes = new ArrayList<>();
        heroes.add("Beatrix");
        heroes.add("Martis");
        heroes.add("Martis");
        heroes.add("Lesley");
        heroes.add("Xavier");
        heroes.add("Yin");

        System.out.println(heroes);

        ArrayList<String> nonDup = new ArrayList<>();

        for (String hero : heroes) {
            if (!nonDup.contains(hero)){
                nonDup.add(hero);
            }
        }

        heroes = nonDup;

        System.out.println(heroes);


    }
}
