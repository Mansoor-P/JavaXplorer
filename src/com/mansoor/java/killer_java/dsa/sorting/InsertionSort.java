package com.mansoor.java.killer_java.dsa.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr []={2,5,7,1,9,10};
        for (int i = 0; i < arr.length; i++) {

            int current=arr[i];
            int j=i-1;
            while(j>=0&&current<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        printArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
