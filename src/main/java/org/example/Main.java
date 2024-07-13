package org.example;

import model.Customer;
import model.ObjectFactory;
import model.Order;
import model.ProductManager;

public class Main {
    public static void main(String[] args) {

        ProductManager manager = ProductManager.getInstance();
        manager.addProduct(ObjectFactory.createProduct(1, "Laptop", 1500.0, "Electronics", 10));
        manager.addProduct(ObjectFactory.createProduct(2, "Phone", 800.0, "Electronics", 20));

        Customer customer = ObjectFactory.createCustomer("Muhammet","5");
        Order order = ObjectFactory.createOrder();
        order.addProduct(manager.getProduct(1));
        order.addProduct(manager.getProduct(2));
        order.generateInvoice();

        customer.addOrder(order);

        System.out.println("Customer " + customer.getName()+" Total Invoice Amount: " + order.getInvoice().getAmount());
        System.out.println("Customer Orders" + customer.getOrders());

    }
}