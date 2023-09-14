package com.mansoor.java.killer_java.corejava.arrays;

import java.util.Scanner;

public class TrieSumTarget {
    static int triSum(int arr[] , int target){
        int ans=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if (arr[i]+arr[j]+arr[k]==target){
                        ans++;
                    }
                }
            }
        }
        return  ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array length");
        int n=sc.nextInt();
        int arr[] =new int [n];
        System.out.println("Enter " + n + " Elements ");
        for (int i = 0; i <n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter Target sum");
        int target = sc.nextInt();

        System.out.println(triSum(arr,target));
    }
}
