package com.mansoor.java.killer_java.corejava.strings;

public class Palindrome {
    public static void main(String[] args) {
        String str="racecar";
        int left=str.length()/2;
       int right=(str.length()-1)-left;
        if (left==right) {
            System.out.println("this is palindrome");
        }else{
            System.out.println("not palindrome");
        }
        System.out.println(str.length()-1);
    }
}
