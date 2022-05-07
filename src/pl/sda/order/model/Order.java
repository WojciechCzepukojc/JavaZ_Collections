package pl.sda.order.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Order {


    private static int counter = 1;

    private  Integer id;                    //numer zamówienia

    private LocalDateTime createDate;       //data utworzenia zamówienia

    private Map<ProductType, List<Product>> productMap;                //ukrywamy szczegóły implementacyjne enkapsulacja, hermetyzacja

        public Order() {
            this.id = counter++;
            this.createDate = LocalDateTime.now();
            this.productMap = new HashMap<>();
    }

    public Integer getId() {
        return id;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void addProduct (Product product){

            if (productMap.containsKey((product.getType()))){
        List<Product> products = productMap.get(product.getType());
        products.add(product);
            } else {
                List<Product> products = new ArrayList<>();
                products.add(product);
                productMap.put(product.getType(), products );
            }


    }

    public List<Product> getProductsByType(ProductType productType) {
        return productMap.get(productType);

    }

    public List<Product> getProducts(){
            List<Product> result = new ArrayList<>();

            for (List<Product> products : productMap.values()){
                result.addAll(products);
            }

            return result;
    }

    public int size(){
            int sum = 0;

        for (List<Product> products : productMap.values()) {
            sum += products.size();
        }
            return sum;
    }

    public boolean removeProductByID (Integer id) {

        for (List<Product> products : productMap.values()) {

            Product productToRemove = null;

            for (Product product : products) {
                if (product.getId().equals(id)) {
                    productToRemove = product;
                    break;
                }
            }
            if (productToRemove != null) {
                products.remove(productToRemove);
                return true;
            }
        }
        return false;
    }


    }



