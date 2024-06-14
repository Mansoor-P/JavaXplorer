package com.mansoor.java.killer_java.dsa.arrays;

import java.util.Scanner;

public class LastOccurence {
    static  int last(int[]arr,int x){
        int count =-1;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]==x){
//                count=i;
//            }
//        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>=x){
                count++;
            }
        }
    return count;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("enter element size ");
        int n=sc.nextInt();
        int arr[] =new int [n];

        System.out.println("Enter " + n + " Elements ");
        for (int i = 0; i <arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("enter x value");
        int x= sc.nextInt();
        System.out.println(last(arr,x));
    }
}
