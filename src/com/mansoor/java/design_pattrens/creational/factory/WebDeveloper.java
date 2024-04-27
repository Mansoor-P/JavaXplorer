package com.mansoor.java.design_pattrens.creational.factory;

public
class WebDeveloper implements  Employee{
    @Override
    public
    int salary() {
        System.out.println("Getting Web Developer Salary");
        return 4000000;
    }
}
