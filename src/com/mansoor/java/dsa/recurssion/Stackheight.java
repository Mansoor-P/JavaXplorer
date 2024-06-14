package com.mansoor.java.dsa.recurssion;
import java.lang.*;

public class Stackheight  {
    // stack height =n
    public static int printstackHeight(int x,int n){
        if (n == 0) {

            return 1;
        }
        if(x==0){
            return 0;
        }
        int pow=printstackHeight(x,n-1);
        int power=x*pow;


       return power;
    }

    public static void main(String[] args) {
        int x=2;
        int n=5;
        int result=printstackHeight(x,n);
        System.out.println(result);
    }
}
