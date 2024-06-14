package com.mansoor.java.dsa.arrays;


import java.util.Arrays;

import static java.util.Arrays.*;

public class NegativeMoving {

    public static void main(String[] args) {
        int arr[] = {-12, 11, -13, -5, 6, -7, 5, -3, -6};

        Arrays.sort(arr);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" , ");
//        }
        for (int i:arr){
            System.out.print(i+" , ");
        }



    }
}
