package com.mansoor.java.killer_java.dsa.sorting;

public
class QuickSort {
    static void displayArray(int[] arr){
        for (int val:arr) {
            System.out.print(val+" ");
        }
    }
    static void swap (int[] arr,int x, int y){
        int temp =arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }

    static void quickSort(int[] arr,int st,int end){
        if(st>=end) return;

        int pi=partition(arr,st,end);
        quickSort(arr, st,pi-1);
        quickSort(arr,pi+1,end);
    }

    private static
    int partition(int[] arr, int st, int end) {
        int pivot=arr[st];
        int cnt=0;
        for (int i = st+1; i <=end ; i++) {
            if(arr[i]<=pivot) cnt++;
        }
        int pivotIndex=st+cnt;
        swap(arr,st,pivotIndex);
    int i=st,j=end;
        while(i<pivotIndex &&j>pivotIndex){
            while (arr[i]<=pivot) i++;
            while(arr[j]>pivot) j--;
            if(i<pivotIndex &&j>pivotIndex){
                swap(arr,i,j);
                i++;
                 j--;
            }
        }
        return pivotIndex;
    }


    public static  void main(String[] args) {
        int[] arr={4,1,3,5,2};
//        int n=arr.length;
        System.out.println("Before Sorting");
        displayArray(arr);
        System.out.println();
        quickSort(arr,0, arr.length-1);
        System.out.println("Array after sorting");
        displayArray(arr);
    }
}
