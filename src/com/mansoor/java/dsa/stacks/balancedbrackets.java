package com.mansoor.java.dsa.stacks;

import java.util.Scanner;
import java.util.Stack;

public class balancedbrackets {
    public static boolean isBalanced(String str){
        Stack<Character> st=new Stack<>();
        int n=str.length();
        for (int i = 0; i < n; i++) {
            char ch=str.charAt(i);
            if(ch=='('){
                st.push(ch);
            }
            else{
                if(st.size()==0){
                    System.out.println("The size is 0 &&  Unbalance Occured  index is "+str.charAt(i));
                    return false;
                }
                if(st.peek()=='(') st.pop();
            }
        }
        if(st.size()>0) {
            System.out.println("The no of braces for balance is"+st.size());
            return false;
        }
        else {
            return true;
        }

    }
    public static void main(String[] args) {
        System.out.println("Enter The Brackets");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(isBalanced(str));
    }
}
