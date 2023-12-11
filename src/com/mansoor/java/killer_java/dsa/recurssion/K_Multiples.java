package com.mansoor.java.killer_java.dsa.recurssion;

import java.util.Scanner;

public class K_Multiples {
    static void kth_multiples(int n,int k){
        if (k==0) return;
        if (k==1){
            System.out.println(n);
            return;
        }

        kth_multiples(n,k-1);
        System.out.println(n*k);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n and k values");
        int n=sc.nextInt();
        int k=sc.nextInt();

        kth_multiples(n,k);
    }
}
