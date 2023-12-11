package com.mansoor.java.killer_java.dsa.recurssion;

import java.util.Scanner;

public class Alternativesigns {
    static int alternativeSigns(int n){
        if(n==0) return 0;

        if (n%2!=0){
            return alternativeSigns(n-1)+n;
        }
        else {
            return alternativeSigns(n-1)-n;
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(alternativeSigns(n));
    }
}
