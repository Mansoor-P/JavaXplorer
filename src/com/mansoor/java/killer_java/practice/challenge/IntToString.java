package com.mansoor.java.killer_java.practice.challenge;

import java.util.Scanner;

public class IntToString {

        public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            int n=scan.nextInt();
            String s=Integer.toString(n);
            if(s instanceof String ){
                System.out.print("Good job");
            }else{
                System.out.print("Wrong answer");
            }
        }
    }

