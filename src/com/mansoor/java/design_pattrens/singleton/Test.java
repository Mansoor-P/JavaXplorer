package com.mansoor.java.design_pattrens.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class Test {
    public static void main(String[] args) throws Exception ,CloneNotSupportedException{

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
         *      solution :
         *          Implements readResolve() method
         *
         * III.cloning the object
         * */

//        Samosa s1=Samosa.INSTANCE;
////        Samosa s1=Samosa.getSamosa();
//        System.out.println(s1.hashCode());
//
////        s1.test();
//        Constructor<Samosa> constructor=Samosa.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        Samosa s2=constructor.newInstance();
//        System.out.println(s2.hashCode());

        Samosa samosa=Samosa.getSamosa();
        System.out.println(samosa.hashCode());

//        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("abc.ob"));
//        oos.writeObject(samosa);
//
//        System.out.println("Serialization Done");
//
//        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("abc.ob"));
//        Samosa s2=(Samosa)ois.readObject();
//
//        System.out.println("Deserialization Done");

        Samosa s3=(Samosa) samosa.clone();
        System.out.println(s3.hashCode());

    }
}
