package com.mansoor.java.killer_java.OOPS;

public class StudentConstructor {
    public  static class Student {
        String name;
        int rollNo;
        double percent;

        public Student(String name,int rollNo,double percent){
           this.name=name;
            this.rollNo=rollNo;
            this.percent=percent;


        }

    }

    public static void main(String[] args) {
        Student s=new Student("Mansoor",18,93.2);
        System.out.println(s.name+s.rollNo+s.percent);
    }
    }
