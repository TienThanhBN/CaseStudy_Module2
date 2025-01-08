package model;

import java.util.*;

public class ProductRepository {
    private List<Product> productList = new ArrayList<>();
    private Set<Product> productSet = new HashSet<>();
    private Map<Integer, Product> productMap = new HashMap<>();

    public void addProduct(Product product) {
        productList.add(product);
        productSet.add(product);
        productMap.put(product.getId(), product);
    }

    public Product getProductById(int id) {
        return productMap.get(id);
    }

    public List<Product> getAllProducts() {
        return new ArrayList<>(productList);
    }
}