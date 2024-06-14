package com.mansoor.java.killer_java.dsa.arrays;

import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a and b values");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Before Swapped " +a+" and "+b);
        int temp =a;
        a=b;
        b=temp;
        System.out.println("After Swapped "+a+" and "+b);
    }
}
