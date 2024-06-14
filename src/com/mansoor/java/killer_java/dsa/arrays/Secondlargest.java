package com.mansoor.java.killer_java.dsa.arrays;

import java.util.Scanner;

public class Secondlargest {

    static int findmax(int arr[]){
        int mx=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>mx){
                mx=arr[i];
            }
        }
        return  mx;
    }
    static int findsecondmax(int arr[]){
        int mx=findmax(arr);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==mx){
                arr[i]=Integer.MIN_VALUE;
            }
        }
        int secondmax=findmax(arr);
        return secondmax;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println("Enter " + n + " Elements ");
        for (int i = 0; i <n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("second largest is : "+findsecondmax(arr));
    }
}
