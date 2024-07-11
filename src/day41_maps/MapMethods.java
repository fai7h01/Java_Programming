package day41_maps;

import java.util.Map;
import java.util.TreeMap;

public class MapMethods {
    public static void main(String[] args) {

        Map<String, String> map = new TreeMap<>();
        map.put("C02", "Josh");
        map.put("B03", "Nora");
        map.put("A02", "Khashayar");
        map.put("D02", "Abdullah");
        map.put("A03", "Tatiana");
        map.put("A04", "Tatiana");
        map.put("A05", "Tatiana");
        map.put("A06", "Tatiana");
        map.put("A07", "Tatiana");

        System.out.println(map.size());
        System.out.println(map);

        System.out.println(map.get("A04"));

        System.out.println(map.get("A04"));

        map.put("A04", "Lucy");
        map.put("A06", "Tatuli");
        System.out.println(map);

        System.out.println(map.get("B03"));

        map.replace("A07", "Sesili"); // faster than put method if we want to replace value
        map.replace("C02", "Luka");
        System.out.println(map);

        map.remove("A02");
        System.out.println(map);

        System.out.println(map.containsKey("B03")); // true
        System.out.println(map.containsKey("H98")); // false

        System.out.println(map.containsValue("Lucy"));
        System.out.println(map.containsValue("Levi"));

        System.out.println(map.isEmpty());
        System.out.println(map.equals(map));

        map.clear();

        System.out.println(map);

    }
}
/*
pair: id - name
 */