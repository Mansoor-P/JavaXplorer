package com.mansoor.java.killer_java.corejava.collections.generics;


class Capsule{ }
class Tablet{
//    public static void main(String[] args) {
//        System.out.println("Tablets");
//    }
}
 class Bottle <T> {
    private T item;

    public void setItem(T item){
        this.item=item;
    }

    public T getItem() {
        return this.item;
    }
    public class GenericDemo{
        public static void main(String[] args) {
            Bottle <Tablet> tablets=new Bottle<>();
            tablets.setItem(new Tablet());
            Tablet tablet=tablets.getItem();
            System.out.println(tablet);
        }
    }
}
