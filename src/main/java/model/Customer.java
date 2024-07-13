package model;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String customerNo;
    private List<Order> orders;


    public Customer() {
        orders = new ArrayList<>();
    }

    public Customer(String name, String customerNo) {
        this.name = name;
        this.customerNo = customerNo;
        orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", customerNo='" + customerNo + '\'' +
                ", orders=" + orders +
                '}';
    }
}
