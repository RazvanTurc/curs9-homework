package ro.fasttrackit.homework9.ex1;

public class Electronics extends Product {

    private String type;
    private float length, width, height, weight;

    public Electronics(float price,
                       String name,
                       String description,
                       int quantity,
                       String type,
                       float length,
                       float width,
                       float height,
                       float weight) {

        super(price, name, description, quantity);
        this.type = super.validString(type);
        this.length = super.validNumber(length, 0.1f);
        this.width = super.validNumber(width, 0.1f);
        this.height = super.validNumber(height, 0.1f);
        this.weight = super.validNumber(weight, 0.1f);
    }

    // Getters


    public String getType() {
        return type;
    }

    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }

    public float getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Electronics{" +
                "price = " + getPrice() + " Lei" +
                ", name = " + getName() + '\'' +
                ", description = " + getDescription() + '\'' +
                ", quantity = " + getQuantity() + '\'' +
                ", type = " + getType() + '\'' +
                ", length = " + getLength() + "cm" + '\'' +
                ", width = " + getWidth() + "cm" + '\'' +
                ", height = " + getHeight() + "cm" + '\'' +
                ", weight = " + getWeight() + "g" + '\'' +
                '}';
    }
}
