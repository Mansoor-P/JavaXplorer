package com.mansoor.java.killer_java.functionalprograming.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting {
    public static void main(String[] args) {
        List name = Arrays.asList("Reflection","Collection","Stream");
        ArrayList<String> names=new ArrayList<>(name);

        List result = names.stream().sorted().collect(Collectors.toList());
        System.out.println(result);
    }
}
