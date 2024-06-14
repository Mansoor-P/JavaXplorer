package com.mansoor.java.killer_java.dsa.arrays;

public class Rearrange {

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
            int len = 10;
            int[] arr = {-6, 10, 8, -5, -14, -17, 23, -20, -18, -19};

            ReArrangeArray(arr, len);

            // Printing the modified array
            for (int i = 0; i < len; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }


