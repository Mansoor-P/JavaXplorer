package com.mansoor.java.killer_java.corejava.collections.collection.list.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class DistinctValues {
    public static void main(String[] args) throws  Exception {
     try{
         ArrayList<Integer> old=new ArrayList<>(Arrays.asList(1, 10, 1, 2, 2, 3, 10, 3, 3, 4, 5, 5));

         System.out.println("old array list " + old);

//         List<Integer> newList=new old.stream().distinct().collect(Collectors.toList());
//         System.out.println("newly distinct list "+ newList);

     }
     catch (Exception e){
         System.out.println(e.getMessage());
     }
    }
}
