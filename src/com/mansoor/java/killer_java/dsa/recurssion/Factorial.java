package com.mansoor.java.killer_java.dsa.recurssion;
public class Factorial {
    public static int factorialnumber(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int smallAns = factorialnumber(n - 1);    // method-2
        int fact = n * smallAns;
        return  fact;
    }
    public static void main(String[] args) {
        System.out.println(factorialnumber(10));
    }
}
