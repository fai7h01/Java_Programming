package day23_arrayList;

import java.util.ArrayList;

public class UniqueElements {
    public static void main(String[] args) {

        ArrayList<String> heroes = new ArrayList<>();
        heroes.add("Beatrix");
        heroes.add("Martis");
        heroes.add("Martis");
        heroes.add("Lesley");
        heroes.add("Xavier");
        heroes.add("Yin");
        heroes.add("Franco");
        heroes.add("Franco");

        for (String each : heroes) {
            if (heroes.indexOf(each) == heroes.lastIndexOf(each)){
                System.out.println(each);
                //break; // for first unique element
            }
        }

    }
}
