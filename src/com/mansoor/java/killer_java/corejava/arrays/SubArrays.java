package com.mansoor.java.killer_java.corejava.arrays;

import java.util.Arrays;

public class SubArrays {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4};
        System.out.print("The subarrays of "+ Arrays.toString(arr)+" is-");
        subArray(arr);
    }
    public static void subArray(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<=n;i++)
        {
            for(int j = i;j<=n;j++)
            {
                for(int k =i;k<j;k++)
                {
                    System.out.print( arr[k]+" ");
                }
                System.out.println();
            }
        }
    }
}
