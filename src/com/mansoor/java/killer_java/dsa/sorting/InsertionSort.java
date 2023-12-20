package com.mansoor.java.killer_java.dsa.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int arr[]){
        int n=arr.length;
        for (int i = 1; i < n; i++) {
            int j=i;
            while(j> 0 && arr[j]<arr[j-1]){
                // swap a[j] , a[j-1]
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }

    }
    public static void main(String[] args) {
        int arr []={2,5,7,1,9,10};
        insertionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
        System.out.println(Arrays.toString(arr));
    }
}
