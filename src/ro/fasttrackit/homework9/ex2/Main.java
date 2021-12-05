package ro.fasttrackit.homework9.ex2;

public class Main {
    public static void main(String[] args) {
        Person razvanTurc = new Programmer(
                "Razvan",
                "Turc",
                1996,
                7,
                19,
                "Cluj...",
                "Backend Dev",
                "java");

        Person adrian = new DatabaseAdmin(
                "Adrian",
                "Lungu",
                1981,
                11,
                21,
                "Oradea...",
                "DataBase Admin",
                "PostgreSQL"
        );

        EmployeeBadge badge0011 = new EmployeeBadge(razvanTurc);
        EmployeeBadge badge2033 = new EmployeeBadge(adrian);

        System.out.println(razvanTurc);
        System.out.println(badge0011.badgeInfo());

        System.out.println(adrian);
        System.out.println(badge2033.badgeInfo());
    }

}
