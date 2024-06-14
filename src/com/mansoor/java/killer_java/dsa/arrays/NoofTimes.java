package com.mansoor.java.killer_java.dsa.arrays;

import java.util.Scanner;

public class NoofTimes {
    static int printarray(int arr[],int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==x){
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

        System.out.println("Enter x Value");
        int x=sc.nextInt();

        System.out.println("count of "+x +" is"+" "+printarray(arr,x));
    }
}
