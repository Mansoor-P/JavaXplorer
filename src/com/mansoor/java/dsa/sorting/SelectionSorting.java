package com.mansoor.java.dsa.sorting;

import java.util.Arrays;

public class SelectionSorting {

    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr []={2,5,7,1,9,10};
        int n=arr.length;

        for (int i = 0; i < n-1; i++) {
            int min_index =i;
            for (int j = i+1; j < n; j++) {
                if (arr[min_index] > arr[j]) {
                    min_index=j;
                }

                // swap current and minimum element --> current index i will have correct element
                // a[min_index],  a[i]

                int temp=arr[min_index];
                arr[min_index]=arr[i];
                arr[i]=temp;
            }
        }
        printArray(arr);
        System.out.println(Arrays.toString(arr));
        }
    }

