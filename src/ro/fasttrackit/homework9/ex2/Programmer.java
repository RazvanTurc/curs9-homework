package ro.fasttrackit.homework9.ex2;

public class Programmer extends Employee{
    private String language;

    // Constructors
    public Programmer(String firstName, String lastName, int yearOfBirth, int monthOfBirth, int dayOfBirth, String address, String position, String language) {
        super(firstName, lastName, yearOfBirth, monthOfBirth, dayOfBirth, address, position);
        this.language = notNull(language);
    }

    // Getters
    @Override
    public String getPosition() {
        return language.substring(0,1).toUpperCase() + language.substring(1).toLowerCase() + " Programmer";
    }

    // toString
    @Override
    public String toString() {
        return super.toString() +
                getPosition() + "\n";
    }
}
