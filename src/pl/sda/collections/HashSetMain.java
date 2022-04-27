package pl.sda.collections;

import java.util.HashSet;

public class HashSetMain {
    public static void main(String[] args) {

        HashSet<Integer> hashSet = new HashSet<>();

        hashSet.add(10);
        hashSet.add(87);
        hashSet.add(45);
        hashSet.add(44);
        hashSet.add(23);

        hashSet.remove(87);

        for (Integer i : hashSet){
            System.out.print(i + " ");      //kolejność wstawiania nie jest zachowana
        }


    }
}
