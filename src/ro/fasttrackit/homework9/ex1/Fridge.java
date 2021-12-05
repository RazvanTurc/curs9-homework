package ro.fasttrackit.homework9.ex1;

public class Fridge extends Electronics {
    private float temperature;

    public Fridge(float price,
                  String name,
                  String description,
                  int quantity,
                  String type,
                  float length,
                  float width,
                  float height,
                  float weight,
                  float temperature) {
        super(price, name, description, quantity, type, length, width, height, weight);
        this.temperature = idealTemperature(temperature);
    }

    protected float idealTemperature(float temperature) {
        return (temperature > 0.0f && temperature < 3.3f) ? temperature : 1.7f;
    }

    // Getter
    public float getTemperature() { return temperature; }

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
                ", temperature = " + getTemperature() + "C" + '\'' +
                '}';
    }
}
