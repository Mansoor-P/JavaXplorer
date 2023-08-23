package com.mansoor.java.killer_java.functionalprograming.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbers {
    public static void main(String[] args) {
        ArrayList <Integer> al=new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(4);
        al.add(3);

        System.out.println(al);
        List st=al.stream().filter(i ->i%2==0 ).collect(Collectors.toList());    // even numbers
        Long st1=al.stream().filter(i ->i<3).count();    // count method

        List sorted  =al.stream().sorted().collect(Collectors.toList());    // sorted method


        System.out.println(st);
        System.out.println(st1);
        System.out.println(sorted);

    }
}
