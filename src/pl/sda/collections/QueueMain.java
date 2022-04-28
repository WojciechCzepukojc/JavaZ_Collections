package pl.sda.collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

public class QueueMain {
    public static void main(String[] args) {


        ArrayDeque <Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.offer(12);
        arrayDeque.offer(34);
        arrayDeque.offer(32);
        arrayDeque.offerFirst(84);
        arrayDeque.offerFirst(74);
        arrayDeque.offerFirst(62);

        System.out.println(arrayDeque.element());
        System.out.println(arrayDeque.getLast());

        for (Integer i : arrayDeque){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println();

        PriorityQueue<String> priorityQueue = new PriorityQueue<>();

        priorityQueue.add("Jacek");
        priorityQueue.add("Marcel");
        priorityQueue.add("Amelia");
        priorityQueue.add("Jarek");
        priorityQueue.add("Malwina");
        priorityQueue.add("Halina");

        for (String s : priorityQueue){
            System.out.print(s + " ");
        }

    }
}
