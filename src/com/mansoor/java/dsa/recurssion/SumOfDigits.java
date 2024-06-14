package com.mansoor.java.dsa.recurssion;

public class SumOfDigits {
    static int sod(int n){
        if (n>=0 && n<=9) return n;
        return sod(n/10)+n%10;
    }

    public static void main(String[] args) {
        System.out.println(sod(1234));

//        System.out.println(1234/10);
    }
}
