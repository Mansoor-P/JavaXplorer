package com.mansoor.java.design_pattrens.creational.singleton;

import java.io.Serializable;

public class  Samosa  implements Serializable,Cloneable {

//    public enum Samosa {
//        INSTANCE;
//public void test() { System.out.println("This method from  enum class"); }

    private static Samosa samosa;
    // Constructor
   private Samosa(){
//       if (samosa!= null){
//           throw new RuntimeException("You are trying to break the singleton pattern");
//       }
   }
    // lazy way of  creating singleton object
    public static Samosa getSamosa(){
       //object of this class
     if(samosa==null){
         synchronized (Samosa.class){
             if(samosa==null){
                 samosa=new Samosa();
             }
         }
     }
        return samosa;
    }

    public Object readResolve() {
        return samosa;
    }
    @Override
    public Object clone() throws CloneNotSupportedException{

//       return samosa;
       return super.clone();
    }
}

/*
*  singleton pattern rules
*
* 1.constructor private
* 2.object create with the help of method
* 3.create field to store object is private
*
* */