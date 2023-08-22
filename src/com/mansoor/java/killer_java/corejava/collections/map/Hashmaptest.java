package com.mansoor.java.killer_java.corejava.collections.map;

import java.util.LinkedHashMap;

public class Hashmaptest {
    public static void main(String[] args) {
        var map = new LinkedHashMap<Character, Integer>();
        var s = "mansoor";
        for (char c : s.toCharArray()) {
            var count = map.getOrDefault(c,0);
            map.put(c,  count+ 1);
        }
        System.out.println(map);

    }
}