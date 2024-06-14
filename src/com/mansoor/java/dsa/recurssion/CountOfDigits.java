package com.mansoor.java.dsa.recurssion;

public class CountOfDigits {
    static int cod(int n){
        if(n>=0&&n<=9) return 1;


        return 1+cod(n/10);
    }

    public static void main(String[] args) {
        System.out.println(cod(5683));
    }

}
