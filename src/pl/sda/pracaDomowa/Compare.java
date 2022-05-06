package pl.sda.pracaDomowa;

import java.util.Comparator;

public class Compare implements Comparator <Book>{



    @Override
    public int compare(Book b1, Book b2) {
        if (b1.getISBN() == b2.getISBN())
            return 0;
        else if (b1.getISBN()>b2.getISBN())
            return 1;
        else
            return -1;
    }
}
