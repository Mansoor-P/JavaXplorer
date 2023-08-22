package com.mansoor.java.killer_java.dsa.recurssion;

public class StackHeightlogn {
    // StackHeight = logn
    public static int printlogn(int x,int n){
        if (n == 0) {

            return 1;
        }
        if(x==0){
            return 0;
        }
        if (n % 2 ==0)
            return printlogn(x,n/2)*printlogn(x,n/2);
            else return printlogn(x,n/2)*printlogn(x,n/2) *x;
    }

    public static void main(String[] args) {
        int x=2 ,n=5;
        int result=printlogn(x,n);
        System.out.println(result);
    }
}
