package com.mansoor.java.killer_java.dsa.sorting.practice;

public
class Sort012s_method_2
{
    static void displayArray(int[] num)
    {
        for (int val :num)
        {
            System.out.print(val+" ");
        }
        System.out.println();
    }
    static void swap(int[] a,int x,int y)
    {
        int temp=a[x];
        a[x]=a[y];
        a[y]=temp;
    }
    static void sort_012(int[] a)
    {
        int lo=0,mid=0,hi=a.length-1;

        // explore the unknown region
         while(mid<=hi )
         {
             if(a[mid]==0)
             {
                 swap(a,mid,lo);
                 mid++;
                 lo++;
             }
             else if (a[mid]==1)
             {
                 mid++;
             }
             else
             {
                 swap(a,mid,hi);
                 hi--;
             }
         }
    }
    public static void main(String[] args)
    {
        int[] num={2,2,1,2,2,0,1,0,2,0};
        sort_012(num);
        displayArray(num);
    }


}
