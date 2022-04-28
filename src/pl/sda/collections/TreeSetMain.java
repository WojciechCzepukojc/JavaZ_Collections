package pl.sda.collections;

import pl.sda.compare.Book;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetMain {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(20);
        treeSet.add(95);
        treeSet.add(14);
        treeSet.add(8);
        treeSet.add(54);
        treeSet.add(67);

        for (Integer i : treeSet) {
            System.out.print(i + " ");
        }
        System.out.println();

        SortedSet<Integer> tailSet =  treeSet.tailSet(54);
        for (Integer i : tailSet){
            System.out.print(i + " ");
        }
        System.out.println();

        SortedSet<Integer> subSet = treeSet.subSet(14, 67);
        for (Integer i : subSet){
            System.out.print(i + " ");
        }


        System.out.println();


        SortedSet<Integer> headSet =  treeSet.headSet(54);
        for (Integer i : headSet){
            System.out.print(i + " ");
        }











        System.out.println();
        TreeSet<Book> books = new TreeSet<Book>();
        Book b1 = new Book("Ogniem i mieczem", "Henryk Sienkiewicz", 12586);
        Book b2 = new Book("Pan Tadeusz", "Adam Mickiewicz", 24856);
        Book b3 = new Book("Balladyna", "Juliusz Słowacki", 25886);

        books.add(b1);
        books.add(b2);
        books.add(b3);

        for (Book b : books.descendingSet()){           //sortowanie od z do a
            System.out.println(b);
        }


    }
}
