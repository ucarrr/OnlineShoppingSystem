package model;

public class ObjectFactory {
    public static Product createProduct(int id, String name, double price, String category, int stock) {
        return new Product(id, name, price, category, stock);
    }

    public static Customer createCustomer(String name, String customerNo) {
        return new Customer( name,  customerNo);
    }

    public static Order createOrder() {
        return new Order();
    }

    public static Invoice createInvoice(double amount) {
        return new Invoice(amount);
    }
}
