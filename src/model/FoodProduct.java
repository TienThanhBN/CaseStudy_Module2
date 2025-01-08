package model;

public class FoodProduct extends Product {
    private int shelfLife; // Thời hạn sử dụng (tính bằng ngày)

    public FoodProduct(int id, String name, double price, int shelfLife) {
        super(id, name, price);
        this.shelfLife = shelfLife;
    }

    @Override
    public String getDetails() {
        return String.format("Food [ID: %d, Name: %s, Price: %.2f, Shelf Life: %d days]",
                id, name, price, shelfLife);
    }
}
