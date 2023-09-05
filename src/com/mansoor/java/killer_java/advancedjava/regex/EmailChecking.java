package com.mansoor.java.killer_java.advancedjava.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailChecking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Email");
        String email=sc.next();

        Pattern pattern=Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");
        Matcher matcher=pattern.matcher(email);

        if (matcher.matches()){
            System.out.println("Email is Valid");
        }else{
            System.out.println("Invalid Email");
        }
    }
}
