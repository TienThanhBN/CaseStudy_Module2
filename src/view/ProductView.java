package view;

import model.Product;

import java.util.List;

public class ProductView {
    public void displayProduct(Product product) {
        System.out.println(product.getDetails());
    }

    public void displayAllProducts(List<Product> products) {
        products.forEach(product -> System.out.println(product.getDetails()));
    }
}
