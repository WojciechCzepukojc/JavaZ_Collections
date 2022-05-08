package pl.sda.stream;

import pl.sda.compare.Book;
import pl.sda.compare.Library;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class BookStreamMain {

    public static void main(String[] args) {

        Book b1 = new Book("Ogniem i mieczem", "Henryk Sienkiewicz", 12586, LocalDate.now().minusYears(54));
        Book b2 = new Book("Pan Tadeusz", "Adam Mickiewicz", 24856, LocalDate.now().minusYears(95));
        Book b3 = new Book("Balladyna", "Juliusz słowacki", 25886, LocalDate.now().minusYears(47));
        Book b4 = new Book("Potop", "Henryk Sienkiewicz", 25876, LocalDate.now().minusYears(85));
        Book b5 = new Book("Sezon_Burz", "Andrzej Sapkowski", 65946, LocalDate.now().minusYears(21));
        Book b6 = new Book("Mistrz_i_Małgorzata", "Michaił Bulhakow", 47563, LocalDate.now().minusYears(120));


        List<Book> bookList = Arrays.asList(b1, b2, b3, b4, b5, b6);

        //printBooksDistinctByAuthor(bookList, "Henryk Sienkiewicz");

        Library lib1 = new Library("Warszawa", Arrays.asList(b1, b2));
        Library lib2 = new Library("Kraków", Arrays.asList(b3, b4));
        Library lib3 = new Library("Wrocław", Arrays.asList(b5, b6));

        List<Library> libraries = Arrays.asList(lib1, lib2, lib3);

        printBooksFronLibraries(libraries);

        boolean isBookInLIb = isBookInLibrary(libraries, "Kraków", "Balladyna");
        System.out.println(isBookInLIb);


        Optional<Book> bookOptional = getBookByTitle(bookList, "Balladyna");
        bookOptional.ifPresent(System.out::println);


        printBooksForReleaseDateRange(bookList, LocalDate.now().minusYears(100), LocalDate.now());

        System.out.println();

        printBookReleasedAfterGivenYear(bookList, 1950 );
    }






    private static void printBooksDistinctByAuthor (List<Book> books, String author){
        books.stream()
                .filter((b) -> b.getAuthor().equals(author))
                .map(Book::getTitle)
                .forEach(System.out::println);

    }

    private static void printBooksFronLibraries(List<Library> libraries){
        libraries.stream()
                .map((lib) -> lib.getBooks())
                .flatMap(list -> list.stream())
                .forEach(System.out::println);
    }
    private static boolean isBookInLibrary(List<Library> libraries, String city, String title) {
        return libraries.stream()
                .filter(lib -> lib.getCity().equals(city))
                .map(lib -> lib.getBooks())
                .flatMap(list -> list.stream())
                .anyMatch(b -> b.getTitle().equals(title));
    }

    private static Optional<Book> getBookByTitle(List<Book> books, String title){
        return books.stream()
                .filter(b ->b.getTitle().equals(title) )
                .findFirst();
    }

    private static void printBooksForReleaseDateRange(List<Book> books, LocalDate from, LocalDate to){

        books.stream()
                .filter(b -> b.getReleaseDate().isAfter(from) )
                .filter(b -> b.getReleaseDate().isBefore(to))
                .map(b -> b.getAuthor() +" " + b.getTitle())
                .forEach(System.out::println);

    }

    private static void printBookReleasedAfterGivenYear (List<Book> books, int year){
        books.stream()
                .filter(b -> (int) b.getReleaseDate().getYear()>year)
                .map(b-> b.getTitle())
                .forEach(System.out::println);
    }





    }


