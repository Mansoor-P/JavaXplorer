package com.mansoor.java.killer_java.OOPS;

public class StudentClass {
    // creating a new data type with multiple attributes
    public static class Student{
        String name;
        int rollNo;
        double percent;

    }
    public static void fun(Student x){
    System.out.println(x.name);
    }
    public static void main(String[] args) {
        Student x=new Student(); // declaration and x is the Object

        x.name="Mansoor";  // initialization
        x.rollNo=1234;
        x.percent=92.5;

        fun(x);
//        System.out.println(x.name +" "+x.rollNo+" "+x.percent);
    }
}
