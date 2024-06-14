package com.mansoor.java.dsa.recurssion;

public class PowerFinding {
   static int pof(int p,int q){
       if(q==0)return 1;
       return  pof(p,q-1)*p;

   }

    public static void main(String[] args) {
        System.out.println(pof(2,3));
    }
}
 