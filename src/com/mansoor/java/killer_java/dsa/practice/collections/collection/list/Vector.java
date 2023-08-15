package dsa.practice.collections.collection.list;

public class Vector {
    public static void main(String[] args) {
        java.util.Vector v1=new java.util.Vector();
        v1.add(0, "mansoor");
        v1.add(1, "munaf");
        v1.add(2, "manoj");
        v1.add(3, "sainath");
        v1.add(4, "pal");
        v1.add(5, "manikanta");
        v1.add(0, "manohar");
        System.out.println(v1);
        System.out.println(v1.size());
        System.out.println(v1.capacity());
       System.out.println(v1.get(1));
    }
}
