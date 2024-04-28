package com.mansoor.java.design_pattrens.creational.singleton.dbConnection.doubleLocking;

public class Main {
    public static void main(String[] args) {
        DBConnection connObject = DBConnection.getInstance();
    }
}
