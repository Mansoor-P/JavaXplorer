package com.mansoor.java.killer_java.dsa.recurssion;

import java.util.Scanner;

public class NatualNumbers {
    public static void sumofNumbers(int i,int n,int sum){

        if(n==i){
            return;
        }
        sum=n*(n+1)/2;
        System.out.println(sum);
    }

    static void printIncresing(int n){  // 1,2,3.....n-1,n
        if(n==1){
            System.out.println(n);  // base case  or Halting Condition
            return;
        }
        printIncresing(n-1); // 1,2,3.....n-1
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printIncresing(n);
//        sumofNumbers(1,5,0);
    }
}
