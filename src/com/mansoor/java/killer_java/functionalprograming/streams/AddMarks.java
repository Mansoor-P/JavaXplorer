package com.mansoor.java.killer_java.functionalprograming.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AddMarks {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(4);
        al.add(3);

        System.out.println(al);
        List st=al.stream().map(i ->i+5).collect(Collectors.toList());
        System.out.println(st);
    }
}
