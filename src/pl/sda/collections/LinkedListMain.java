package pl.sda.collections;

import java.util.LinkedList;

public class LinkedListMain {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(22);
        linkedList.add(44);
        linkedList.add(102);
        linkedList.add(69);

        linkedList.addFirst(10);


        for (Integer i : linkedList){
            System.out.print(i + " ");
        }



    }
}
