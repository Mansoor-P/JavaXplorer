package com.mansoor.java.killer_java.dsa.recurssion;

public class Printnumb {
    public static void printNumbers(int n){
        if(n==0){
            return;
        }

        System.out.println(n);
        printNumbers(n-1);
    }

    public static void main(String[] args) {
        int n=8;
    printNumbers(n);
    }
}
