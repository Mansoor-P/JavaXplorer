package com.mansoor.java.design_pattrens.creational.singleton.dbConnection.doubleLocking;

public class DBConnection {
    private static DBConnection conObj;

    // Private constructor prevents instantiation outside
    public DBConnection() {
    }

    public static DBConnection getInstance() {
        if (conObj == null) {
            synchronized (DBConnection.class) {
                if (conObj == null) {
                    conObj = new DBConnection();
                }
            }
        }
        return conObj;
    }

}
