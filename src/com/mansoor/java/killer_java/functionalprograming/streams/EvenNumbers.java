package com.mansoor.java.killer_java.functionalprograming.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EvenNumbers {
    public static void main(String[] args) {
        ArrayList <Integer> al=new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(4);
        al.add(3);

        System.out.println(al);


        List st=al.stream().filter(i ->i%2==0 ).collect(Collectors.toList());    // filter() method
        System.out.println(st);


        List  j=al.stream().map(i->i*i).collect(Collectors.toList());           // map() method
        System.out.println(j );


        Long st1=al.stream().filter(i ->i<3).count();                          // count() method
        System.out.println(st1);


        List sorted  =al.stream().sorted().collect(Collectors.toList());      // sorted() method
        System.out.println(sorted);

        al.stream().forEach(System.out::println);                            // forEach() method

        Stream <Integer> s=Stream.of(1,11,111,1111,11111 );         // Stream.of() method
        s.forEach(System.out::println);


        Integer[] i=al.stream().toArray(Integer[]::new);                  // toArray() method
        Stream.of(i).forEach(System.out::println);


    }
}
