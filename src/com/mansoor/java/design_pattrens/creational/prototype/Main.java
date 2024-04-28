package com.mansoor.java.design_pattrens.creational.prototype;

public class Main {
    public static void main(String[] args) {
        // originalObj
        Student obj=new Student(20,18,"Mansoor");

        // cloneObj
        Student cloneObj=(Student) obj.clone();
        System.out.println(cloneObj.name);


    }
}
