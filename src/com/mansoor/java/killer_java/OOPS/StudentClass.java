package com.mansoor.java.killer_java.OOPS;

public class StudentClass {

    public static void main(String[] args) {
        Student x=new Student(); // declaration and x is the Object

        x.name="Mansoor";  // initialization
        x.percent=92.5;
//        x.rollNo=1234;
//        System.out.println(x.getRollNo());

        x.setRollNo(18);
        System.out.println(x.getRollNo());

    }
}
