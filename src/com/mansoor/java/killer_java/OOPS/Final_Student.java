package com.mansoor.java.killer_java.OOPS;

public class Final_Student {
    public static class Student {
        String name;
        int rollNo;
        double percent;
       final String schoolName ="Z P High School";
    }
    public void Student(){

    }
    public static void main(String[] args) {
        Student x=new Student(); // declaration and x is the Object

        x.name="Mansoor";  // initialization
        x.percent=92.5;
        x.rollNo=1234;


        System.out.println(x.schoolName);

    }
    }
