package com.mansoor.java.killer_java.practice.challenge;

import java.util.Scanner;

public class MultiTable {
    public static void main(String[] args) {
        int n ,i;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer to print it's multiplication table");
        n = in.nextInt();
        System.out.println("Multiplication table of "+n+" is :-");
        for (i = 0; i <=10 ; i++) {
            System.out.println(n+"*"+i+" = "+(n*i));

        }
    }
}
