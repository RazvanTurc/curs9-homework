package ro.fasttrackit.homework9.ex1;

public class Main {

    public static void main(String[] args) {
        Product product1 = new Cosmetics(
                1.2f,
                "Glet",
                "Description",
                10,
                "Blue",
                10);

        Product product2 = new Cosmetics(
                23.99f,
                "Gletiera",
                null,
                2,
                null,
                2);

        Product electronic = new Electronics(
                22.3f,
                "Bec",
                "Bec Phillips",
                1,
                "Electronic",
                12,
                5,
                10,
                20);

        Product fridge = new Fridge(
                3500,
                "No Freez Beko",
                "Frigider Beko No Freez",
                1,
                "Frigider",
                40,
                50,
                210,
                50000,
                2.2f);

        System.out.println(product1.toString());
        System.out.println(product2.toString());
        System.out.println(electronic.toString());
        System.out.println(fridge.toString());
        }

}
