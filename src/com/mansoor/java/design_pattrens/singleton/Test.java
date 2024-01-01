package com.mansoor.java.design_pattrens.singleton;

import java.lang.reflect.Constructor;

public class Test {
    public static void main(String[] args) throws Exception {

//        // Lazy way
//        Samosa samosa1=Samosa.getSamosa();
//        System.out.println("Samosa1 gets : " + " " +samosa1.hashCode() );
//
//        Samosa samosa2=Samosa.getSamosa();
//        System.out.println("Samosa2 gets : "+ " " +samosa2.hashCode());
//
//        // eager way
//        Jalebi jalebi1=Jalebi.getJalebi();
//        System.out.println("jalebi1 gets : " + " " +jalebi1.hashCode() );
//
//        Jalebi jalebi2=Jalebi.getJalebi();
//        System.out.println("jalebi1 gets : "+ " " +jalebi1.hashCode());



        // ways to break singleton pattern
        /*
         * I.Reflection api breaks singleton pattern
         *       solution :
         *           1-> if object is there = throw exception from inside constructor
         *           2-> use enum
         *
         * II. Deserialization
         * */


//        Samosa s1=Samosa.INSTANCE;
        Samosa s1=Samosa.getSamosa();
        System.out.println(s1.hashCode());

//        s1.test();
        Constructor<Samosa> constructor=Samosa.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Samosa s2=constructor.newInstance();
        System.out.println(s2.hashCode());


    }
}
