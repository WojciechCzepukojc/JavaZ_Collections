package pl.sda.functional;

public class PrintableMain {
    public static void main(String[] args) {

        Printable p =  (obj) -> System.out.println("Printable result: " + obj);

        p.print("string");

        Printable p3 = (obj) -> {

            for (int i = 0; i < 10; i++) {
                System.out.println(obj);

            }

        };
        p3.print(2000);


        Printable p2 = new Printable() {
            @Override
            public void print(Object obj) {
                System.out.println("Anonimous result: " + obj);
            }
        };

        p2.print("object");


    }
}
