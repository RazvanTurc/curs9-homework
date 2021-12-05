package ro.fasttrackit.homework9.ex2;

import java.time.LocalDate;
import java.time.Period;

public class EmployeeBadge {
    private Person person;

    public EmployeeBadge(Person person) {
        this.person = person;
    }

    public String fullName() {
        return person.getFirstName() + " " + person.getLastName();
    }

    public String getAge() {
        Period age = Period.between(person.getBirthday(), LocalDate.now());
        return age.getYears() + " years";
    }

    public String badgeInfo() {
        return "EmployeeBadge Info: " +"\n" +
                fullName() + "\n" +
                getAge() + "\n";
    }
}
