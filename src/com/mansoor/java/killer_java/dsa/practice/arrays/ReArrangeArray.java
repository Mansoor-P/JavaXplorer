package dsa.practice.arrays;

import java.util.Scanner;

public class ReArrangeArray {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void ReArrangeArray(int[] arr, int len) {
        if (arr == null || len <= 1)
            return;

        int left = 0;
        int right = 0;

        while (right < len) {
            if (arr[right] < 0) {
                swap(arr, left, right);
                left++;
            }
            right++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int len = scanner.nextInt();

        int[] arr = new int[len];
        System.out.println("Enter the elements of the array separated by spaces:");
        for (int i = 0; i < len; i++) {
            arr[i] = scanner.nextInt();
        }

        ReArrangeArray(arr, len);

        // Printing the modified array
        System.out.println("Modified Array:");
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }

        scanner.close();
    }
}
