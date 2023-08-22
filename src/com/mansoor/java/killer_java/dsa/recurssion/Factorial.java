package com.mansoor.java.killer_java.dsa.recurssion;

public class Factorial {
    public static int factorialnumber(int n){
        if (n==0 || n==1){
            return 1;
        }

        int fact=n*(n-1);
        int factorial=n*fact;
        return factorial;
    }

    public static void main(String[] args) {
int n=10;
int f=factorialnumber(n);
        System.out.println(f);
    }
}
