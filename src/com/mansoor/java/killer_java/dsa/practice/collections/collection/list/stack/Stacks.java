package dsa.practice.collections.collection.list.stack;
import java.util.Stack;
public class Stacks {
    public static void main(String[] args) {
        Stack<Integer>si=new Stack<>();
        si.push(1);
        si.push(39);
        si.push(12);
        si.push(3);
        si.add(23);
        for (int i = 0; i < si.size(); i++) {
            System.out.println(si.get(4));
        }

        System.out.println(si.isEmpty());

    }
}
