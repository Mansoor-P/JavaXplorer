package com.mansoor.java.design_pattrens.creational.singleton.synchronize;

public class DBConnection {
    private static DBConnection conObj;

    // Private constructor prevents instantiation outside
    public DBConnection() {
    }

    // locking for n times is most crusial so almost this method is never used
    synchronized public static DBConnection getInstance() {
        if (conObj == null) {
            conObj = new DBConnection();
        }
        return conObj;
    }

}
