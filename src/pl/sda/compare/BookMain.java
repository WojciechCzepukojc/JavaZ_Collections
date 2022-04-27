package pl.sda.compare;

public class BookMain {
    public static void main(String[] args) {


        Book b1 = new Book("Ognoiem i mieczem", "Henryk Sienkiewicz", 12586);
        Book b2 = new Book("Pan Tadeusz", "Adam Mickiewicz", 24856);
        Book b3 = new Book("Balladyna", "Juliusz słowacki", 25886);

        System.out.println(b1.equals(b1));
        System.out.println(b2.equals(b1));
        System.out.println(b1.equals(b2));
        System.out.println(b1.equals(b2));
        System.out.println(b2.equals(b3));
        System.out.println(b1.equals(b3));
        System.out.println(b1.equals(null));

        System.out.println(b1.hashCode());
        System.out.println(b2.hashCode());
        System.out.println(b3.hashCode());
        System.out.println(b1.hashCode());
        System.out.println(b2.hashCode());
        System.out.println(b3.hashCode());

        System.out.println(b1.compareTo(b2));           //liczba ujemna  bo b1 mnijsze od b2
        System.out.println(b2.compareTo(b3));           //liczba dodatnia bo b2 większe od b3

        BookComparator bookComparator = new BookComparator();
        System.out.println(bookComparator.compare(b1,b3));

    }
}
