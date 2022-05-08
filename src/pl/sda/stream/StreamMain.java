package pl.sda.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain  {
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("poniedziałek", "wtorek", "środa", "czwartek", "piątek", "sobota", "niedziela");

        List<String> result = strings
                .stream()
                .filter((s) -> s.endsWith("a"))
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());


        result.forEach((s) -> System.out.print(s + " "));

        System.out.println("");
        System.out.println("");

        boolean boolResult = strings
                .stream()
                .allMatch((s) -> s.length()> 3);
        System.out.println(boolResult);

        System.out.println("");

        long count = strings
                .stream()
                .filter((s) -> s.length()>6)
                .count();
        System.out.println(count);

        System.out.println("");

        strings
                .stream()
                .filter((s) -> s.length()>6)
                .forEach(System.out::println);
        System.out.println("");
        strings
                .stream()
                .map((s) -> s.length())
                .forEach(System.out::println);
        System.out.println("");
        strings
                .stream()
                .mapToInt((s) -> s.length())
                .forEach(System.out::println);

        System.out.println("");
        int sum =  Stream.of(1,2,6,3,8,4,5,6)
                .reduce((a,b) -> a+b )
                .get();
        System.out.println(sum);



    }
}
