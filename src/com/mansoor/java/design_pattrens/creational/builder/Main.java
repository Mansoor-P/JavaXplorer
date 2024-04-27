package com.mansoor.java.design_pattrens.creational.builder;

public
class Main {
    public static
    void main(String[] args) {
        User1 user=  new User1.UserBuilder()
              .setEmailId("abc@gmail.com")
              .setUserID("USER1")
              .setUserName("Mansoor")
              .build();
        System.out.println(user);
       User1 user2= new User1.UserBuilder()
                .setUserID("USER2")
                .setUserName("Munaf")
                .setEmailId("xyz@gmail.com")
                .build();
       System.out.println(user2);
    }
}
