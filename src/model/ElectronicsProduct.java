package model;

public class ElectronicsProduct extends Product {
    private int warrantyMonths;

    public ElectronicsProduct(int id, String name, double price, int warrantyMonths) {
        super(id, name, price);
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public String getDetails() {
        return String.format("Electronics [ID: %d, Name: %s, Price: %.2f, Warranty: %d months]",
                id, name, price, warrantyMonths);
    }
}
