package com.mansoor.java.design_pattrens.singleton;

public class Samosa {

    private static Samosa samosa;
    // Constructor
   private Samosa(){

    }

    // lazy way of  creating singleton object
    public static Samosa getSamosa(){

       //object of this class
        if(samosa==null){
            samosa=new Samosa();
        }
        return samosa;
    }
}
