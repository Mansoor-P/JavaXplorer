package com.mansoor.java.killer_java.advancedjava.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPractice {
    public static void main(String[] args) {
        Pattern p=Pattern.compile("Mansoor");
        Matcher m=p.matcher("Mansoor");

        if(m.matches()){
            System.out.println("Successfully Mached");
        }
        else{
            System.out.println("Not Matched");
        }
    }
}
