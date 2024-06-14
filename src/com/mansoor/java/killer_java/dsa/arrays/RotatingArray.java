package com.mansoor.java.killer_java.dsa.arrays;

import java.util.Scanner;

public
class RotatingArray {
    static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] +" ");
        }
    }

    static int[] rotate(int[] arr,int k){
        int n=arr.length;
        k=k%n;
        int ans[]=new int[n];
        int j=0;

        for (int i = n-k; i <n ; i++) {
            ans[j++]=arr[i];
        }
        for (int i = 0; i <n-k; i++) {
            ans[j++]=arr[i];
        }
        return ans;
    }

    public static
    void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No.Of Elements");
        int n=sc.nextInt();
        int arr []=new int[n];
        System.out.println("Enter " +n+" Elements");

        for (int i = 0; i <n; i++) {
            arr [i]=sc.nextInt();

        }
        System.out.println("Enter K :");
        int k=sc.nextInt();

        System.out.println("Original Array : ");
        printArray(arr);
        int[] ans=rotate(arr,k);
        System.out.println("After Array Sorting : ");
        printArray(ans);
    }
}
