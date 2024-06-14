package com.mansoor.java.killer_java.dsa.arrays;

import java.util.Scanner;

public class searching {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        n=sc.nextInt();
        int [] arr=new int[10];
        System.out.println("enter elements");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Array elements are: ");
        for (int i=0; i<n; i++) {
            if (arr[i]==2)
                System.out.println("True");
            else System.out.println("False");
        }


    }
}
