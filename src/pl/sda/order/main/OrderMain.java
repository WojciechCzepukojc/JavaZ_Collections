package pl.sda.order.main;

import pl.sda.order.service.OrderService;

import java.util.Scanner;

public class OrderMain {

    private static OrderService orderService = new OrderService();
    private static Scanner scanner  = new Scanner(System.in);


    public static void main(String[] args) {

        int choose = 0;



        do {

            System.out.println("Wybierz opcję: ");
            System.out.println("0 - zakończ");
            System.out.println("1 - utwórz zamówienie" );
            System.out.println("2 - dodaj produkt do zamówienia" );
            System.out.println("3 - wypisz zamówienie" );
            System.out.println("4 - usuń produkt z zamówienia" );

            choose = scanner.nextInt();

            switch (choose){
                case 0: System.exit(0);

                case 1:
                    createOrder();
                    break;

                case 2:
                    addProductToOrder();
                    break;

                case 3:
                    printOrder();
                    break;

                case 4:
                    removeProductFromOrder();
                    break;

                default:
                    System.out.println("Nie rozpoznano operacji");
                    break;
            }



        }while (true);
        //koniec metody main
    }

    private static void  createOrder(){
        int orderID = orderService.createOrder();
        System.out.println("Pomyślnie utworzono zamówienie o id " + orderID);
    }

    private static void addProductToOrder(){
        System.out.println("Podaj ID zamówienia:");
        int orderID = scanner.nextInt();

        System.out.println("Podaj typ produktu:");
        String type = scanner.next();

        System.out.println("Podaj nazwę produktu:");
        String name = scanner.next();

        System.out.println("Podaj producenta produktu:");
        String producer = scanner.next();

        System.out.println("Podaj opis produktu:");
        String description = scanner.next();


        int productId = orderService.addProductToOrder(orderID, type, name, producer, description);
        System.out.println("Pomyślnie dodano produkt " + productId + " do zamówienia "+ orderID);
    }


    private static void  printOrder(){
        System.out.println("Podaj id zamówienia");
        int orderID = scanner.nextInt();
        System.out.println("Zamówienie składa sie z produktów");
        orderService.printOrder(orderID);
    }


    private static void  removeProductFromOrder(){
        System.out.println("Podaj id zamówienia");
        int orderID = scanner.nextInt();

        System.out.println("Podaj id produktu");
        int productID = scanner.nextInt();

        boolean result = orderService.removeProductFromOrder(orderID, productID);

        if (result){
            System.out.println("Pomyślnie usunięto produkt");
        }else{
            System.out.println("Nie udało się usunąć produktu");
        }
    }

}
