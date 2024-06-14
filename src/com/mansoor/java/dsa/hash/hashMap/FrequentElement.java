package com.mansoor.java.dsa.hash.hashMap;

import java.util.HashMap;
import java.util.Map;

public class FrequentElement {
    public static void main(String[] args) {
        int []arr={1,4,2,5,1,1,1,3,1,5,7,8,4,4,4};
        Map<Integer,Integer>freq=new HashMap<>();
        for (var el:arr){
            if(!freq.containsKey(el)){
                freq.put(el,1);
            } else{
                freq.put(el, freq.get(el)+1);
            }
        }
        System.out.println("frequency map");
        System.out.println(freq.entrySet());
        int maxFreq=-1,ansKey=-1;
        for(var e:freq.entrySet()){
            if (e.getValue()>maxFreq){
                maxFreq=e.getValue();
                ansKey=e.getKey();
            }
        }
        System.out.println(ansKey);
        for(var key :freq.keySet()){
            if (freq.get(key)>maxFreq){
                maxFreq= freq.get(key);
                ansKey= key;
            }
        }
        System.out.println(maxFreq);

    }
}
