package com.mansoor.java.killer_java.dsa.recurssion;

public class RecrsiveFunctionCalling {
    static void fun1(){
        int x=1;
        fun2();
        System.out.println(x);
    }
    static void fun2(){
       int y=2;
        fun3();
        System.out.println(y);
    }
    static void fun3(){
      int  z=3;

        System.out.println(z);
    }
    public static void main(String[] args) {
        fun1();
    }
}
