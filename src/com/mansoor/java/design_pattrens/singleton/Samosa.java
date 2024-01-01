package com.mansoor.java.design_pattrens.singleton;
public class  Samosa {

//    public enum SamosaEn {
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
      synchronized (Samosa.class){
          if(samosa==null){
              samosa=new Samosa();
          }
      }
        return samosa;
    }
}
