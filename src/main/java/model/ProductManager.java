package model;

import java.util.HashMap;
import java.util.Map;

public class ProductManager {
    private static ProductManager instance;
    private Map<Integer, Product> products;

    public ProductManager() {
        products = new HashMap<>();
    }

    public static ProductManager getInstance() {
        if (instance == null) {
            synchronized (ProductManager.class) {
                if (instance == null) {
                    instance = new ProductManager();
                }
            }
        }
        return instance;
    }

    public void addProduct(Product product) {
        products.put(product.getId(), product);
    }

    public Product getProduct(int id) {
        return products.get(id);
    }
}
