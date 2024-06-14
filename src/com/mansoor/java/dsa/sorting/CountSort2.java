package com.mansoor.java.dsa.sorting;

public
class CountSort2 {
    static int findMax(int [] arr){
        int mx=Integer.MIN_VALUE;
        for (int i = 0; i <arr.length; i++) {
            if(arr[i]>mx){
                mx=arr[i];
            }
        }
        return mx;
    }
     static
    void countSort(int[] arr) {
        int n=arr.length;
        int[] output=new int [n];
        int max=findMax(arr);
        int count[] =new int[max+1];
         for (int i = 0; i < arr.length; i++) {
             count[arr[i]]++;
         }
         for (int i = 1; i < count.length ; i++) {
             count[i]=count[i]+count[i-1];
         }

         // find the index of each element in the original array and put it in output array

         for (int i = n-1; i >=0 ; i--) {
             int idx=count[i-1];
             output[idx]=arr[i];
             count[arr[i]]--;

         }
         for (int i = 0; i < n; i++) {
             arr[i]=output[i];
         }
    }
    static void display(int[] a) {
        for (int val:a) {
            System.out.print(val+" " );
        }
    }
    public static
    void main(String[] args) {
        int [] arr={1,4,5,2,2,5};
        countSort(arr);
        display(arr);
    }


}
