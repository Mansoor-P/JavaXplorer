package dsa.practice.collections.map;

import java.util.Hashtable;
import java.util.Map;

public class HashTabletest {
    public static void main(String[] args) {
       Map<Integer,String> hm=new Hashtable<>();
        hm.put(1,"mansoor");
        hm.put(10,"maheshwar");
        hm.put(5,"Manohar");
        hm.put(100,"Amit");
        hm.put(102,"Ravi");
        hm.put(101,"Vijay");
        hm.put(103,"Rahul");
        System.out.println(hm);

    }
}
