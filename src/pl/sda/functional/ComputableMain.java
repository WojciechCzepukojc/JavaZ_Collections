package pl.sda.functional;

public class ComputableMain {

    public static void main(String[] args) {

        Computable adder = (a, b) -> a + b;

        double result = adder.compute(10.5, 11.3);
        Printable p = (obj) -> System.out.println(result);
        p.print(result);





    }
}
