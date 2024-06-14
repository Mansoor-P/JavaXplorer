package com.mansoor.java.dsa.recurssion;

public class StringInReverse {
    public static void reverse(String str,int inx){

        if(inx==0){
            System.out.println(str.charAt(inx));
            return;
        }
        System.out.println(str.charAt(inx));
        reverse(str,inx-1);
    }

    public static void main(String[] args) {
        String str="abcd";
        reverse(str,str.length()-1);
    }
}
