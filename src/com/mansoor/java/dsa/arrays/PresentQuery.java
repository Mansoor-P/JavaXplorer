package com.mansoor.java.dsa.arrays;

import java.util.Scanner;

public
class PresentQuery {

    static int[] makeFrequencyArray(int[] arr){
        int[] freq=new int[100005];
        for (int  i= 0;  i<arr.length ; i++) {
            freq[arr[i]]++;
        }
        return freq;
    }
    public static
    void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size");
        int n=sc.nextInt();
        int arr []=new int[n];

        System.out.println("Enter " +n+" Elements");
        for (int i = 0; i <n; i++) {
            arr [i]=sc.nextInt();

        }
        int[] freq=makeFrequencyArray(arr);

        System.out.println("Enter number of Queries  :");
        int q=sc.nextInt();

        while(q>0) {
            System.out.println("Enter number to be Searched");
            int x = sc.nextInt();
            if (freq[x] > 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            q--;

        }
    }
}
