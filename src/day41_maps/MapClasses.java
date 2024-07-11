package day41_maps;

import java.util.*;

public class MapClasses {
    public static void main(String[] args) {

        Map<String, Integer> hashMap = new HashMap<>(); // random order, accept null key & null values
        hashMap.put("Daniel", 95000);
        hashMap.put("Emily", 100000);
        hashMap.put("Bella", 85000);
       // hashMap.put("Daniel", 80000);
        hashMap.put("Aaron", 78000);
        hashMap.put("Chris", null);
        hashMap.put("Brian", null);
        hashMap.put(null, 120000);
        hashMap.put(null, 110000);
        hashMap.put(null, 100000);

        System.out.println("hashMap = " + hashMap);

        System.out.println("--------------------------------------------------------------------");
        
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(); // insertion order, accept null key & null values
        linkedHashMap.put("Daniel", 95000);
        linkedHashMap.put("Emily", 100000);
        linkedHashMap.put("Bella", 85000);
        // linkedHashMap.put("Daniel", 80000);
        linkedHashMap.put("Aaron", 78000);
        linkedHashMap.put("Chris", null);
        linkedHashMap.put("Briana", null);
        linkedHashMap.put(null, 120000);
        linkedHashMap.put(null, 110000);
        linkedHashMap.put(null, 100000);

        System.out.println("linkedHashMap = " + linkedHashMap);

        System.out.println("--------------------------------------------------------------------");

        Map<String, Integer> treeMap = new TreeMap<>(); // sorted order (ascending), does not accept null key, but allows null values
        treeMap.put("Daniel", 95000);
        treeMap.put("Emily", 100000);
        treeMap.put("Bella", 85000);
        // treeMap.put("Daniel", 80000);
        treeMap.put("Aaron", 78000);
        treeMap.put("Chris", null);
        treeMap.put("Briana", null);  // value can be null ini treeMap
        //treeMap.put(null, 120000);  null key is not allowed in treeMap
        //treeMap.put(null, 110000);
        //treeMap.put(null, 100000);

        System.out.println("treeMap = " + treeMap);

        System.out.println("--------------------------------------------------------------------");

        Map<String, Integer> hashtable = new Hashtable<>(); // random order, does not accept null key or null values, synchronized
        hashtable.put("Daniel", 95000);
        hashtable.put("Emily", 100000);
        hashtable.put("Bella", 85000);
        // hashtable.put("Daniel", 80000);
        hashtable.put("Aaron", 78000);
        /*hashtable.put("Chris", null);        value can not be null in hashtable
        hashtable.put("Briana", null);         value can not be null in hashtable
        hashtable.put(null, 120000);           key can not be null in hashtable
        hashtable.put(null, 110000);           key can not be null in hashtable
        hashtable.put(null, 100000);           key can not be null in hashtable        */


        try{
            hashtable.put(null, 100000);
        }catch (NullPointerException e){
            e.printStackTrace();
        }

        System.out.println("hashtable = " + hashtable);




    }
}
/*
pair: name & salary
Daniel = 95000
Emily = 100000
Bella = 85000

 */