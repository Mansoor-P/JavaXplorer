package com.mansoor.java.design_pattrens.singleton;

public class Test {
    public static void main(String[] args) {

        // Lazy way
        Samosa samosa1=Samosa.getSamosa();
        System.out.println("Samosa1 gets : " + " " +samosa1.hashCode() );

        Samosa samosa2=Samosa.getSamosa();
        System.out.println("Samosa2 gets : "+ " " +samosa2.hashCode());

        // eager way
        Jalebi jalebi1=Jalebi.getJalebi();
        System.out.println("jalebi1 gets : " + " " +jalebi1.hashCode() );

        Jalebi jalebi2=Jalebi.getJalebi();
        System.out.println("jalebi1 gets : "+ " " +jalebi1.hashCode());

    }
}
