package dsa.practice.collections.collection.list.arraylist;

import java.util.ArrayList;

import static java.lang.Integer.*;

public class AList {
    public static void main(String[] args) {


        ArrayList <Integer> ar=new ArrayList<>();
        int arr[]={1,4,2,6,4,8,7,9,0,2,1,5,6,7,8,3};
        for (int i = 0; i < arr.length; i++) {

            ar.add(arr[i]);
        }
        System.out.println(ar);











//        ArrayList <Integer> al=new ArrayList<Integer>();
//        String numbers = "12 34 67 45 36 8988 234 123 454 343 221 454 232";
//        for (String s: numbers.split(" ")) al.add(parseInt(s));
//        var n = al.size();
//        System.out.println(al);
//        var min = MAX_VALUE; var max=0;
//        var sum = 0;
//        for(var i: al) {
//            sum += i;
//            if (max < i) max = i;
//            if (min > i) min = i;
//        }
//        System.out.println("Maximum is : " + max);
//        System.out.println("Minimum is : " + min);
//        System.out.println("Sum is : "+sum);
//        System.out.println("Average is : "+sum/(float) al.size());
//        int middileF = al.get(n/2);
//        if(al.size()%2==0) middileF = (middileF+al.get((n/2)-1))/2;
//        System.out.println("Middle element "+middileF);



    }
}
