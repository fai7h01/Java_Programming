package day42_maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
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

        Map<String, String> employees = new TreeMap<>();
        employees.putAll(map);

        System.out.println(employees);

        System.out.println(map == employees); // false ==> diff objects diff memory allocation

        System.out.println(map.equals(employees)); // true

    }
}
