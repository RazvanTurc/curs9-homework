package ro.fasttrackit.homework9.ex2;

import java.time.LocalDate;
import java.util.Objects;

public class Employee implements Person{
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String address;
    private LocalDate dateOfEmployment;
    private String position;

    // Constructors
    public Employee(String firstName, String lastName, int yearOfBirth, int monthOfBirth, int dayOfBirth, String address, String position) {
        this.firstName = notNull(firstName);
        this.lastName = notNull(lastName);
        this.dateOfBirth = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.address = notNull(address);
        this.dateOfEmployment = LocalDate.now();
        this.position = notNull(position);
    }

    //Getters
    public LocalDate getDateOfEmployment() {
        return dateOfEmployment;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public LocalDate getBirthday() {
        return dateOfBirth;
    }

    @Override
    public String getAddress() {
        return address;
    }

    // NotNULL
    protected String notNull(String string) {
        return Objects.requireNonNullElse(string,"N/A");
    }

    //toString
    @Override
    public String toString() {
        return "Employee: " + "\n" +
                "First Name = " + firstName + "\n" +
                "Last Name = " + lastName + "\n" +
                "Date of Birth = " + dateOfBirth + "\n" +
                "Address = " + address + "\n" +
                "Date of Employment = " + dateOfEmployment + "\n" +
                "Position = " + position + "\n"
                ;
    }
}
