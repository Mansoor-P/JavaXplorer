package com.mansoor.java.killer_java.dsa.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxandMin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number of elements you want to store: ");

        var n=sc.nextInt();

        int [] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Array elements are: ");
        for (int i = 0; i <n ; i++) {
            System.out.println(arr[i]);

        }
        Arrays.sort(arr);
        System.out.println(arr[0]);
        System.out.println(arr[n-1]);
    }
}
