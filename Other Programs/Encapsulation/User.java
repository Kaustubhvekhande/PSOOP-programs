import java.util.Scanner;

class User {
    String name;
    int age;
    double accbalence;

    User() {
        this.name = "Balmukund Chaoudhari";
        this.age = 60;
        this.accbalence = 10000;
    }

    User(String Name, int Age, double AccBlanace) {
        this.name = Name;
        this.age = Age;
        this.accbalence = AccBlanace;
    }

    Movie m1 = new Movie();

    boolean canWatch() {
        if (age >= m1.getAgerestriction() && accbalence >= m1.getCost()) {
            return true;
        } else {
            return false;
        }
    }

    void watchMovie() {
        if (canWatch()) {
            System.out.println("User is watching the movie");
            accbalence -= m1.cost;
        } else {
            System.out.println("Sorry, you cannot watch this movie.");
        }

    }

}

class Movie {
    String title;
    int agerestriction;
    double cost;

    Movie() {
        title = "Inception";
        agerestriction = 15;
        cost = 250;
    }

    Movie(String title, int ageRestriction, double cost) {
        this.title = title;
        this.agerestriction = ageRestriction;
        this.cost = cost;
    }

    public int getAgerestriction() {
        return agerestriction;
    }

    public double getCost() {
        return cost;
    }
}

class Main {
    public static void main(String[] args) {
        // User u1 = new User();
        // Movie m = new Movie();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the details of User:");
        System.out.print("Name : ");
        String name = sc.nextLine();
        System.out.print("Age : ");
        int age = sc.nextInt();
        System.out.println("Account Balence : ");
        double balance = sc.nextDouble();
        sc.nextLine();
        User u1 = new User(name, age, balance);

        System.out.println("Enter the details of the movie: ");
        System.out.print("Title: ");
        String title = sc.nextLine();
        System.out.print("Age Restriction: ");
        int agerating = sc.nextInt();
        System.out.print("Cost: Rs.");
        double price = sc.nextDouble();

        Movie m1 = new Movie(title, agerating, price);

        u1.watchMovie();

        sc.close();

    }
}
