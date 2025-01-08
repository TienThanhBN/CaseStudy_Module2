package model;

public class ClothingProduct extends Product {
    private int size;

    public ClothingProduct(int id, String name, double price, int size) {
        super(id, name, price);
        this.size = size;
    }

    @Override
    public String getDetails() {
        return String.format("Clothing [ID: %d, Name: %s, Price: %.2f, Size: %d]",
                id, name, price, size);
    }
}
