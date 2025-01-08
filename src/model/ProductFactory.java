package model;

public class ProductFactory {
    public static Product createProduct(String type, int id, String name, double price, int extra) {
        switch (type.toLowerCase()) {
            case "electronics":
                return new ElectronicsProduct(id, name, price, extra);
            case "food":
                return new FoodProduct(id, name, price, extra);
            case "clothing":
                return new ClothingProduct(id, name, price, extra);
            default:
                throw new IllegalArgumentException("Invalid product type!");
        }
    }
}
