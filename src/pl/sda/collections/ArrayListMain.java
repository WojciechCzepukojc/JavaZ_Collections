package pl.sda.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListMain {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(1);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(0,100);



        System.out.println(arrayList.size());
        System.out.println(arrayList.contains(5));

        System.out.println(arrayList.get(3));
        //System.out.println(arrayList.get(10));                 //wyjątek IndexOutOfBoundsException

        arrayList.remove(Integer.valueOf(6));       // usuwa pierwszą  6 napotkaną w kolekcji
        arrayList.remove(3);                 //usuwa element o indeksie 3

        System.out.println("size after remove: " + arrayList.size());

        for (Integer i : arrayList){
            System.out.print(i + " ");
        }

        System.out.println();

        Iterator<Integer> iterator = arrayList.iterator();          //iterator

        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }


    }
}
