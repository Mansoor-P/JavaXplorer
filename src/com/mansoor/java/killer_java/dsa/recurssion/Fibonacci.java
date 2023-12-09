package com.mansoor.java.killer_java.dsa.recurssion;

public class Fibonacci {
//    public static void printfibonacci(int a,int b,int n){
//        if (n==0){
//            return;
//        }
//        int c=a+b;
//        System.out.println(c);
//        printfibonacci(b,c,n-1);
//    }
    public static int fbc(int n){
        if(n==0 || n==1){
            return n;
        }

//        int prev =fbc(n-1);
//        int prevpre=fbc(n-2);
//
//        return prev+prevpre;

        return fbc(n-1)+fbc(n-2);
    }

    public static void main(String[] args) {
//        int a=0;
//        int b=1;
//        int n=7;
//        System.out.println(a);
//        System.out.println(b);
//        printfibonacci(a,b,n-2);
//
        for (int i = 0; i <=10 ; i++) {
            System.out.println(fbc(i));
        }
    }
}
