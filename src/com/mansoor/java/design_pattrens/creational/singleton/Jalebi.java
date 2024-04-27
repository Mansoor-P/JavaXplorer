package com.mansoor.java.design_pattrens.creational.singleton;

public class Jalebi {

    // Eager way of creating singleton object
    private static Jalebi jalebi = new Jalebi();

    public static Jalebi getJalebi(){
        return jalebi;
    }
}
