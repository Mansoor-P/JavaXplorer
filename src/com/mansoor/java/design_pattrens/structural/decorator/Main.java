package com.mansoor.java.design_pattrens.structural.decorator;

public class Main {
    public static void main(String[] args) {
        BasePizza basePizza=new Mushroom(new ExtraCheese(new Margherita()));
        basePizza.cost();
        System.out.println(basePizza.cost());

    }
}
