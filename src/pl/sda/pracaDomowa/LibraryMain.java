package pl.sda.pracaDomowa;

import java.util.*;

public class LibraryMain {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Wybierz odpowiednią funkcjonalność: 1 - Dodawanie nowej książki 2 - Usunięcie książki 3 - wyświetlenie książki po autorze 4 - wyświetlenie " +
                "książki po tytule 5 - wyświetlenie wszystkich książek 6 - koniec " );
        int menu = scanner.nextInt();


        Book b1 = new Book("Henryk_Sienkiewicz", "Potop", 2587);
        Book b2 = new Book("Andrzej_Sapkowski", "Sezon_Burz", 6594);
        Book b3 = new Book("Michaił_Bulhakow", "Mistrz_i_Małgorzata", 4756);
        Book b4 = new Book("Władysław_Reymont", "Chłopi", 8542);


        LinkedList<Book> books = new LinkedList<>();
        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);

        switch (menu){
            case 1 :


                System.out.println("Podaj autora");
                String a = scanner.next();

                System.out.println("Podaj tytuł");
                String t = scanner.next();


                System.out.println("Podaj numer ISBN");
                int i = scanner.nextInt();

                Book b5 = new Book(a, t, i);
                break;

            case 2:

                System.out.println("Podaj ISBN książki którą chcesz usunąć");
                int isbn = scanner.nextInt();
                for (Book b : books){
                    if (b.getISBN() == isbn){
                        books.remove(b);
                        System.out.println("książka usunięta");
                    }

                }
                break;

            case 3:
                System.out.println("Podaj autora");
                String author = scanner.next();
                for ( Book b : books){
                if (author.equals(b.getAuthor())) {
                    System.out.println(b.getAuthor() + " " + b.getTitle() + " " + b.getISBN());
                }
                }
                break;


            case 4:
                System.out.println("Podaj tytuł");
                String title = scanner.next();
                for (Book b : books){
                    if (title.equals(b.getTitle())){
                        System.out.println(b.getAuthor() + " " + b.getTitle() + " " + b.getISBN());
                    }
                }
                break;

            case 5:
                Collections.sort(books, new Compare());
                for (Book b : books ){
                    System.out.println(b.getISBN() + " " + b.getAuthor() + " " + b.getTitle());


                }



            }


        }



    }

