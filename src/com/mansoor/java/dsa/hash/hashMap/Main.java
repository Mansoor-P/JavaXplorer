package com.mansoor.java.dsa.hash.hashMap;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("mansoor",22);
        map.put("munaf",15);
        map.put("virat",36);
        map.put("ram",24);
        map.put("sai",22);
         for(String key:map.keySet()){
             System.out.printf("Age of %s is %d\n",key,map.get(key));
         }
        for(Map.Entry<String,Integer> e:map.entrySet()){
            System.out.printf("Age of %s is %d\n",e.getKey(),e.getValue());
        }
        for(var e:map.entrySet()){
            System.out.printf("Age of %s is %d\n",e.getKey(),e.getValue());
        }
    }

}
