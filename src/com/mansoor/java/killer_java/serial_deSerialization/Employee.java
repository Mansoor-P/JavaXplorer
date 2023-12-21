package com.mansoor.java.killer_java.serial_deSerialization;

import java.io.*;

public
class Employee implements Serializable {
     private  static final long serialVersionUID=1L;
     private int id;
     private String name;

    public
    int getId() {
        return id;
    }

    public
    void setId(int id) {
        this.id = id;
    }

    public
    String getName() {
        return name;
    }

    public
    void setName(String name) {
        this.name = name;
    }

    public static
    void main(String[] args) {

    }

}
