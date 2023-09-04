package com.mansoor.java.killer_java.advancedjava.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexAdvance {
    public static void main(String[] args) {
        String str="9874563210";
        Pattern p=Pattern.compile("\\d{10}");
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
