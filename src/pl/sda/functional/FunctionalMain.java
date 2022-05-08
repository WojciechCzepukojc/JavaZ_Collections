package pl.sda.functional;

import org.apache.commons.lang3.StringUtils;
import pl.sda.compare.Book;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.*;

public class FunctionalMain {

    public static void main(String[] args) {

        Function<String, Integer> aQuantity = (str) ->{

            int sum = 0;
            for (int i = 0; i<str.length(); i++){
                if (str.charAt(i) == 'a'){
                    sum++;
                }
            }
            return sum;
        };


        Integer result = aQuantity.apply("ajajajauiuaoioaakak");
        System.out.println(result);



        Function<Book, String> titleExtractor  = (book) -> book.getTitle();

        String title = titleExtractor.apply(new Book("Ogniem i mieczem", "Henryk Siernkiewicz", 5486, LocalDate.now().minusYears(100)));
        System.out.println(title);

        System.out.println("");
//***********************************************************************************

        Predicate<String> peselValidator = (str) ->
                str.length() == 11 && StringUtils.isNumeric(str);



        System.out.println("Is PESEL valid: " + peselValidator.test("11545885812"));
        System.out.println("Is PESEL valid: " + peselValidator.test("11545885mn2"));
        System.out.println("Is PESEL valid: " + peselValidator.test("115458858"));


        System.out.println("");
//***********************************************************************************

        Consumer<Book> isbnSeter = (book) -> book.setIsbn(2587);
        Book book = new Book("Ogniem i mieczem", "Henryk Siernkiewicz", 5486, LocalDate.now().minusYears(100));

        isbnSeter.accept(book);
        System.out.println("ISBN after set; " + book.getIsbn());

        System.out.println("");
//***********************************************************************************

        Supplier<String> stringSupplier = () -> "supplier string";
        System.out.println(stringSupplier.get());

        System.out.println("");
//***********************************************************************************

        BiFunction<String, Integer, List<String>> stringMultiplier  = (str, number) -> {
            List<String> strings = new ArrayList<>();

            for (int i = 0; i< number; i++){
                strings.add(str);

            }
            return strings;

        };
        List<String> stringList = stringMultiplier.apply("str", 10);
        stringList.forEach((str) ->System.out.println(str));

        System.out.println("");
//***********************************************************************************


        BinaryOperator<Integer> sumOperator = (a,b) -> a+b;
        System.out.println(sumOperator.apply(4, 58));

        System.out.println("");
//***********************************************************************************


        List<Integer> integers = new ArrayList<>();
        integers.add(23);
        integers.add(56);
        integers.add(89);
        integers.add(951);
        integers.add(4);

        Collections.sort(integers,(a,b) -> b - a);
        integers.forEach((i) -> System.out.print(i + " "));




    }




}
