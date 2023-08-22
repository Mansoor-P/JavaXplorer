package com.mansoor.java.killer_java.dsa.recurssion;

public class TowerOfHanoi {
    public static void towerofHanoi(int n,String src,String help , String des){
        if(n==1){
            System.out.println("transfer disk"+n+"from " +src+"to "+des);
            return;
        }

        towerofHanoi(n-1,src,des,help);
        System.out.println("transfer disk"+n+"from " +src+"to "+des);
        towerofHanoi(n-1,help,src,des);
    }
    public static void main(String[] args) {
        int n=3;
        towerofHanoi(n,"S","H","D ");
    }
}
