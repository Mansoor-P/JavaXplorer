package com.mansoor.java.design_pattrens.creational.singleton.lazy;

public class DBConnection {
    private static DBConnection conObj;

    // Private constructor prevents instantiation outside
    public DBConnection() {
    }

    // when at a time 2 threads comes then 2 objects are created so to prevent that we are moving to synchronized method
    public static DBConnection getInstance() {
        if (conObj == null) {
            conObj = new DBConnection();
        }
        return conObj;
    }

}
