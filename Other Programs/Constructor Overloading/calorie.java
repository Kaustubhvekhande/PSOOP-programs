import java.util.Scanner;

class calorie {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your weight (in pounds):");
        double weight = scan.nextDouble();
        System.out.println("Enter your workout duration (in minutes):");
        double time = scan.nextDouble();
        System.out.println("Enter intensity:");
        double intensity = scan.nextDouble();
        System.out.println("Enter what you ate :");
        System.out.println("Enter 1 for burger (1000 calories in 1 burger ):");
        System.out.println("Enter 2 for rice (500 calories in one bowl):");
        System.out.println("Enter 3 for pizza (1500 calories in one pizza slice):");
        int choice = scan.nextInt();
        double totalcalories = 0;
        if (choice == 1) {
            System.out.println("Enter how many burgers you consumed:");
            double burger = scan.nextDouble();
            totalcalories = 1000 * burger;
        } else if (choice == 2) {
            System.out.println("Enter how many bowls of rice you consumed:");
            double rice = scan.nextDouble();
            totalcalories = 500 * rice;
        } else if (choice == 3) {
            System.out.println("Enter how many slices of pizza you consumed:");
            double slice = scan.nextDouble();
            totalcalories = 1500 * slice;
        } else {
            System.out.println("wrong choice");
        }
        System.out.println("Total calories consumed :" + totalcalories);
        Health H1 = new Health();
        System.out.println("Calories required for Basal metabolic rate :");
        System.out.println(H1.FactorAffecting(weight));
        System.out.println("Calories required for Physical activity :");
        System.out.println(H1.FactorAffecting(intensity, time, weight));
        System.out.println("Energy required to digest food ");
        System.out.println(H1.FactorAffecting1(totalcalories));
        double calorie1 = H1.FactorAffecting(weight);
        double calorie2 = H1.FactorAffecting1(totalcalories);
        double calorie3 = H1.FactorAffecting(intensity, time, weight);
        double Extracalorie = totalcalories - calorie1 - calorie2 - calorie3;
        System.out.println("Extra Calories :" + Extracalorie);
        switch (choice) {
            case 1:
                if (Extracalorie < 0) {
                    int serves = (int) Extracalorie / 1000 * (-1);
                    System.out.println("You need to consume " + serves + " servings");
                } else if (Extracalorie > 0) {
                    int serves2 = (int) Extracalorie / 1000;
                    System.out.println("You need to decrease " + serves2 + " servings");
                } else {
                    System.out.println("You have reached maximum calories today dont consume anything");
                }
                break;
            case 2:
                if (Extracalorie < 0) {
                    int serves = (int) Extracalorie / 500 * (-1);
                    System.out.println("You need to consume " + serves + " servings");
                } else if (Extracalorie > 0) {
                    int serves2 = (int) Extracalorie / 500;
                    System.out.println("You need to decrease " + serves2 + " servings");
                } else {
                    System.out.println("You have reached maximum calories today dont consume anything");
                }
                break;
            case 3:
                if (Extracalorie < 0) {
                    int serves = (int) Extracalorie / 1500 * (-1);
                    System.out.println("You need to consume " + serves + " servings");
                } else if (Extracalorie > 0) {
                    int serves2 = (int) Extracalorie / 1500;
                    System.out.println("You need to decrease " + serves2 + " servings");
                } else {
                    System.out.println("You have reached maximum calories today dont consume anything");
                }
                break;
        }
    }
}

class Health {
    double weight;
    double intensity;
    double time;
    double TotalCaloriesConsumed;

    Health() {
    }

    Health(double weight, double intensity, double time, double TotalCaloriesConsumed) {
        this.time = time;
        this.TotalCaloriesConsumed = TotalCaloriesConsumed;
        this.intensity = intensity;
        this.weight = weight;
    }

    Health(FactorAffecting f) {
        f.weight = weight;
    }

    double FactorAffecting(double Weight) {
        // Basal metabolic rate
        double Calories;
        Calories = 70 * (Weight / 2.2) * 0.756;
        return Calories;
    }

    double FactorAffecting(double Intensity, double time, double Weight) {
        // Physical activity
        double Calories = 0.0385 * Intensity * Weight * time;
        return Calories;
    }

    double FactorAffecting1(double TotalCaloriesConsumed) {
        // Energy required to digest food
        double Calories = TotalCaloriesConsumed * 0.1;
        return Calories;
    }
}
