package pl.sda.order.service;

import pl.sda.order.model.Order;
import pl.sda.order.model.Product;
import pl.sda.order.model.ProductType;

import java.util.ArrayList;
import java.util.List;

//CRUD CREATE READ UPDATE DELETE


public class OrderService {                                 //CREATE

    private List<Order> orders = new ArrayList<>();

    public Integer createOrder(){
        Order order = new Order();
        orders.add(order);
        return order.getId();
    }

    public void printOrder(Integer id){                      //READ

        Order order = getOrderById(id);

        for (int i = 0; i<order.getProducts().size(); i++){
            System.out.println((i+1) + ".- " + order.getProducts().get(i));
        }

    }

    public Integer addProductToOrder(Integer orderId, String type, String name, String producer, String description){      //UPDATE

        Order order = getOrderById(orderId);
        Product product = new Product(ProductType.valueOf(type), name, producer, description);
        order.addProduct(product);
        return product.getId();
    }

    public boolean removeProductFromOrder(Integer orderID, Integer productID){                          //DELETE
        Order order = getOrderById(orderID);
        return order.removeProductByID(productID);
    }

    private Order getOrderById(Integer id){
        for (Order order : orders){
            if (order.getId().equals(id)){
                return order;
            }
        }
        throw new IllegalArgumentException("Unrecognized id " + id);
    }




}
