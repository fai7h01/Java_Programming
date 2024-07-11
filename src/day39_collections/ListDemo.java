package day39_collections;

import java.util.*;

public class ListDemo {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>(); // Array based class ===> get() is faster
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);

        arrayList.get(0);  // retrieving (searching) elements are faster in array because it uses array internally

        LinkedList<Integer> linkedList = new LinkedList<>(); // Node based class (Doubly linked list) ===> add() addAll() remove() removeAll() removeIf() retainAll()
        linkedList.add(100);
        linkedList.add(200);
        linkedList.add(300);  // inserting and deleting elements are faster because elements are represented as a nodes and each node has pointer to prev and next element

        linkedList.remove(0);

        linkedList.get(0);

        System.out.println("---------------------------------------------------------------");

        Vector<Integer> vector = new Vector<>(); // same as ArrayList but synchronized (thread-safe, one thread at the time)
        vector.add(100);
        vector.add(200);
        vector.add(300);

        vector.get(0);

        System.out.println("---------------------------------------------------------------");

        Stack<Integer> stack = new Stack<>(); // same as ArrayList but synchronized, LIFO (last-in first-out) pop()
        stack.add(100);
        stack.add(200);
        stack.add(300);

        System.out.println(stack);

        int lastElement = stack.pop();

        System.out.println(stack);

        int secondLastElement = stack.pop();

        System.out.println(stack);




    }
}
