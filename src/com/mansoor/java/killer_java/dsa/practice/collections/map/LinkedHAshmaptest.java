package dsa.practice.collections.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHAshmaptest {
    public static void main(String[] args) {
        Map<Integer,Character> lm=new LinkedHashMap<>();

        lm.put(1,'m');
        lm.put(6,'o');
        lm.put(2,'a');
        lm.put(5,'o');
        lm.put(3,'n');
        lm.put(7,'r');
        lm.put(4,'s');

        System.out.println(lm);
        for (int i = 0; i < lm.size(); i++) {
            if (lm.containsKey(60)){
                System.out.println(lm.get(i));
            }
            else {
                System.out.println("no letter");
            }
        }

    }
}
