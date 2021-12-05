package ro.fasttrackit.homework9.ex1;

import java.util.Objects;

public class Cosmetics extends Product {
    private String color;
    private float weight;

    // Constructors

    // (No description)
    public Cosmetics(float price,
                     String name,
                     int quantity,
                     String color,
                     float weight) {

        super(price, name, quantity);
        this.color = validColor(color);
        this.weight = validWeight(weight);
    }

    public Cosmetics(float price,
                     String name,
                     String description,
                     int quantity,
                     String color,
                     float weight) {
        super(price, name, description, quantity);
        this.color = validColor(color);
        this.weight = validWeight(weight);
    }

    // Getters
    public String getColor() {
        return color;
    }

    public float getWeight() {
        return weight;
    }

    // Input control Algo
    private String validColor(String color) {
        return Objects.requireNonNullElse(color, "Default");
    }

    private float validWeight(float weight) {
        return Math.max(weight, 0.1f);
    }

    // toString
    @Override
    public String toString() {
        return "Product{" +
                "price = " + getPrice() + " Lei" +
                ", name = '" + getName() + '\'' +
                ", description = '" + getDescription() + '\'' +
                ", quantity = " + getQuantity() + '\'' +
                ", color = " + getColor() + '\'' +
                ", weight = " + getWeight() + "g" +
                '}';
    }
}
