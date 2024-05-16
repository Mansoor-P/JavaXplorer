package com.mansoor.java.design_pattrens.creational.singleton.doubleLocking;

public class Main {
    public static void main(String[] args) {
        DBConnection connObject = DBConnection.getInstance();
    }
}
