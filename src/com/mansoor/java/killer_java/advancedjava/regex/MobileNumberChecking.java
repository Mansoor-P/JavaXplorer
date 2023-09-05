package com.mansoor.java.killer_java.advancedjava.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumberChecking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Mobile Number");
        String phnum=sc.next();

        Pattern pattern=Pattern.compile("\\d{10}");
        Matcher matcher=pattern.matcher(phnum);

        if (matcher.matches()){
            System.out.println("Mobile Number Valid");
        }else{
            System.out.println("Invalid Mobile Number");
        }
    }
}
