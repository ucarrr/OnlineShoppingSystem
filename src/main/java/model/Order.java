package model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Product> products;
    private Invoice invoice;


    public Order() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void generateInvoice() {
        double total = products.stream().mapToDouble(Product::getPrice).sum();
        invoice = ObjectFactory.createInvoice(total);
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }


    @Override
    public String toString() {
        return "Order{" +
                "products=" + products +
                ", invoice=" + invoice +
                '}';
    }
}
