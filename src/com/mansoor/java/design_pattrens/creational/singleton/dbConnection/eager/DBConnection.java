package com.mansoor.java.design_pattrens.creational.singleton.dbConnection.eager;

public class DBConnection {
    private static DBConnection conObj = new DBConnection();

    // Private constructor prevents instantiation outside
    public DBConnection() {
    }

    public static DBConnection getInstance() {
        return conObj;
    }

}
