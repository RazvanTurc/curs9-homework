package ro.fasttrackit.homework9.ex2;

public class DatabaseAdmin extends Employee{
    private String dbTechnology;


    public DatabaseAdmin(String firstName, String lastName, int yearOfBirth, int monthOfBirth, int dayOfBirth, String address, String position, String dbTechnology) {
        super(firstName, lastName, yearOfBirth, monthOfBirth, dayOfBirth, address, position);
        this.dbTechnology = notNull(dbTechnology);
    }

    public String getDbTechnology() {
        return dbTechnology;
    }
    @Override
    public String getPosition() {
        return dbTechnology.substring(0,1).toUpperCase() + dbTechnology.substring(1).toLowerCase() + " Data Base Admin";
    }

    @Override
    public String getAddress() {
        return "db admin: " + super.getAddress();
    }
    @Override
    public String toString() {
        return super.toString() +
                getPosition() + "\n" +
                "Technology = " + dbTechnology + "\n";
    }
}
