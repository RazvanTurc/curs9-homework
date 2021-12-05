package ro.fasttrackit.homework9.ex1;

import java.util.Objects;

public class Product {
    private float price;
    private String name;
    private String description;
    private int quantity;

    // Constructors

    public Product(float price, String name, String description, int quantity) {
        this(price, name, quantity);
        this.description = validString(description);
    }

    // (No description)
    public Product(float price, String name, int quantity) {
        this.price = validNumber(price, 0.1f);
        this.name = validString(name);
        this.quantity = validNumber(quantity, 1);
    }

    // Getters
    public float getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getQuantity() {
        return quantity;
    }

    // Input control Algo
    protected float validNumber(float price, float min) {
        return Math.max(price, min);
    }

    protected int validNumber(int quantity, int min) { return Math.max(quantity, min); }

    protected String validString(String input) {
        return Objects.requireNonNullElse(input, "Not Yet Available");
    }

    // toString

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price + " Lei" +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
