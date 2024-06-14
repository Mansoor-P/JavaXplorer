package com.mansoor.java.killer_java.corejava.basics;
import java.math.BigInteger;


import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {



//        int num = 5;
//        long factorial = 1;
//        for(int i = 1; i <= num; ++i)
//        {
//            factorial *= i;
//        }
//        System.out.printf("Factorial of %d = %d", num, factorial);


        int n, c;
        BigInteger inc = new BigInteger("1");
        BigInteger fact = new BigInteger("1");
        Scanner input = new Scanner(System.in);
        System.out.println("Input an integer");
        n = input.nextInt();
        for (c = 1; c <= n; c++) {
            fact = fact.multiply(inc);
            inc = inc.add(BigInteger.ONE);
        }
        System.out.println(n + "! = " + fact);




}
}