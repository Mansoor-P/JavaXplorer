package com.mansoor.java.design_pattrens.abstractFactory;

public
class AndroidDeveloper implements Employee{

    @Override
    public
    int salary() {
        return 30000;
    }

    @Override
    public
    String name() {
        System.out.println("I am Android Developer");
        return "ANDROID DEVELOPER";
    }
}
