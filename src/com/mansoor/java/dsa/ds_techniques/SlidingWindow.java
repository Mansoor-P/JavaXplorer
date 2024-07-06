package com.mansoor.java.dsa.ds_techniques;

import com.mansoor.java.killer_java.advancedjava.jdbc_connectivity.main;

public class SlidingWindow {
    public static int findMaxSum(int arr[], int k) {

        int i = 0;
        int j = 0;

        int maxSum = 0;
        int windowSum = 0;
        while (j < k) {
            windowSum += arr[j];
            j++;
        }
        maxSum = windowSum;
        while (j < arr.length) {
            windowSum += arr[j] - arr[i];
            maxSum = Math.max(maxSum, windowSum);
            j++;
            i++;

        }
        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 5, 1, 5, 8, 3, 1, 9, 2 };
        int k = 3;
        System.out.println(findMaxSum(arr, k));;
    }

}