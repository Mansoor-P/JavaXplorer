package dsa.practice.sorting;

import java.util.Arrays;

public class Bubblesort {
//    public static void printArray(int arr[]){
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]+" ");
//        }
//    }
    public static void main(String[] args) {
          int arr []={2,5,7,1,9,10};
//        for (int i = 0; i < arr.length-1; i++) {
//            for (int j = 0; j < arr.length-i-1; j++) {
//                if (arr[j] > arr[j+1]) {
//                    int temp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                }
//            }
//        }
        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        printArray(arr);
    }
}
