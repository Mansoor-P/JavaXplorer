package com.mansoor.java.design_pattrens.factory;

public
class WebDeveloper implements  Employee{
    @Override
    public
    int salary() {
        System.out.println("Getting Web Developer Salary");
        return 4000000;
    }
}
