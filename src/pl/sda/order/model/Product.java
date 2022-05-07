package pl.sda.order.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

//POJO
public class Product {

    private static int counter = 1;


    private Integer id;
    private ProductType type;
    private String name;
    private String producer;
    private String description;
    private LocalDateTime createDate;
    private LocalDate expirationDate;


    public Product(ProductType type, String name, String producer, String description) {
        this.type = type;
        this.name = name;
        this.producer = producer;
        this.description = description;
        this.createDate = LocalDateTime.now();                     // automatycznie podstawia aktualny czas i datę pod dany obiekt
        this.expirationDate = calculateExpirationDate();
        this.id = counter++;                                     // ustawiam unikalny numer id zwiększany po kążdym kolejnym uruchomieniu konstruktora
    }
                                                                //usuwam setery pól produktów które nie mają być zmieniane z zewnątrz
    public Integer getId() {
        return id;
    }


    public ProductType getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }


    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }



    private LocalDate calculateExpirationDate(){
        switch (type) {

            case BOOK:
                return createDate.toLocalDate().plusYears(10);
            case TOYS:
                return createDate.toLocalDate().plusYears(3);
            case DRINK:
                return createDate.toLocalDate().plusYears(2);

        }
        return LocalDate.now();         //nigdy się  nie wykona ale musi być bo kompilator na czerwono
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", type=" + type +
                ", name='" + name + '\'' +
                ", producer='" + producer + '\'' +
                ", description='" + description + '\'' +
                ", createDate=" + createDate +
                ", expirationDate=" + expirationDate +
                '}';
    }
}
