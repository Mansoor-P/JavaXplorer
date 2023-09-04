package com.mansoor.java.killer_java.advancedjava.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexAdvance {
    public static void main(String[] args) {
        String str="1234563210";
        Pattern p=Pattern.compile("[987]{2}\\d{8}");
        Matcher m=p.matcher(str);

       while(m.find()){
           System.out.println(str.substring(m.start(),m.end()));
       }
       if (m.matches()){
           System.out.println("Matched");
       }else{
           System.out.println("Not Matched");
       }
    }
}
