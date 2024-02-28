package com.mansoor.java.killer_java.dsa.stacks;

import java.util.Stack;

public class DisplayStack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
//        System.out.println(st);
//        Stack<Integer> rt=new Stack<>();
//        while(st.size()>0){
//            int x=st.pop();
//            rt.push(x);
//        }
//        System.out.println(st);
//        System.out.println(rt);
//        while(rt.size()>0){
//            int x=rt.pop();
//            st.push(x);
//        }
//        System.out.println(rt);
//        System.out.println(st);
//

        // using array
        int n=st.size();
        int [] arr=new int[n];
        for (int i = n-1; i >=0 ; i--) {
            arr[i]=st.pop();
        }
        for (int i = 0; i < n; i++) {
            st.push(arr[i]);
        }

    }
}
