package dsa.practice.collections.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMaptest {
    public static void main(String[] args) {
        Map<String, Integer> treeMap = new TreeMap<>();

        treeMap.put("A", 1);
        treeMap.put("C", 3);
        treeMap.put("B", 2);
        System.out.println(treeMap);

        System.out.println(treeMap.get("A"));

        for (String key : treeMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + treeMap.get(key));
        }
    }
}
