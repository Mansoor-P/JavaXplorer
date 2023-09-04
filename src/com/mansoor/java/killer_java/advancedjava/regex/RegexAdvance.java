package com.mansoor.java.killer_java.advancedjava.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexAdvance {
    public static void main(String[] args) {
        String str="Mansooor1234";
        Pattern p=Pattern.compile("\\w+\\d");
        Matcher m=p.matcher(str);

       while(m.find()){
           System.out.println(str.substring(m.start(),m.end()));
       }
    }
}
