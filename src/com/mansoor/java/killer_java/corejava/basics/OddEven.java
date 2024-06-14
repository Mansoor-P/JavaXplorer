package com.mansoor.java.killer_java.corejava.basics;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int even=n%2;
        if(even==0){
            System.out.println(n +" is Even");
        }else {
            System.out.println(n+" Odd ");
        }
    }

}
