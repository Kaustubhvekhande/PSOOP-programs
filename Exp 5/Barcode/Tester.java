import java.util.Scanner;

class Product {
    private String barcode;
    private String name;

    Product() {

    }

    Product(String barcode, String name) {
        this.barcode = barcode;
        this.name = name;
    }

    String getBarcode() {
        return barcode;
    }

    String getName() {
        return name;
    }
}

class PackedFood extends Product {
    int price;

    PackedFood(String barcode, String name, int price) {
        super(barcode, name);
        this.price = price;
    }

    void display() {
        System.out.println("Barcode: " + this.getBarcode());
        System.out.println("Name: " + getName());
        System.out.println("Price: " + price);
        System.out.println("********************");
    }
}

class FreshFood extends Product {
    int weight;
    int cost;

    FreshFood(String barcode, String name, int cost, int weight) {
        super(barcode, name);
        this.weight = weight;
        this.cost = cost;
    }

    void display() {
        System.out.println("Barcode: " + getBarcode());
        System.out.println("Name: " + getName());
        System.out.println("Price: " + cost);
        System.out.println("Weight: " + weight);
        System.out.println("********************");
    }
}

public class Tester {
    public static void main(String[] args) {
        String barcode, name;
        int price, weight;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of packed food:");
        int num1 = sc.nextInt();
        System.out.print("Enter the number of fresh food:");
        int num2 = sc.nextInt();
        sc.nextLine(); // consume the newline character

        Product p[] = new Product[num1 + num2];

        

       
        
        for (int i = 0; i < num1 + num2; i++) {
            if (i < num1) {
                // Prepacked food entries
                System.out.printf("Enter the barcode of prepacked food %d: ", i + 1);
                barcode = sc.nextLine();
        
                System.out.printf("Enter the name of prepacked food %d: ", i + 1);
                name = sc.nextLine();
        
                System.out.printf("Enter the price of prepacked food %d: ", i + 1);
                price = sc.nextInt();
                sc.nextLine(); // Consume the newline character left by nextInt()
        
                p[i] = new PackedFood(barcode, name, price);
            } else {
                // Fresh food entries
                // Corrected the index for continuity
                int freshFoodIndex = i - num1 + 1;
                System.out.printf("Enter the barcode of fresh food %d: ", freshFoodIndex);
                barcode = sc.nextLine();
        
                System.out.printf("Enter the name of fresh food %d: ", freshFoodIndex);
                name = sc.nextLine();
        
                System.out.printf("Enter the price of fresh food %d: ", freshFoodIndex);
                price = sc.nextInt();
                sc.nextLine(); // Consume the newline character
        
                System.out.printf("Enter the weight of fresh food %d: ", freshFoodIndex);
                weight = sc.nextInt();
                sc.nextLine(); // Consume the newline character
        
                p[i] = new FreshFood(barcode, name, price, weight);
            }
        }
        
        

    for(

    int i = 0;i<num1+num2;i++)
    {
        if (p[i] instanceof PackedFood) {
            PackedFood a = (PackedFood) p[i];
            a.display();
        }
        if (p[i] instanceof FreshFood) {
            FreshFood b = (FreshFood) p[i];
            b.display();
        }
    }

    int index = num1;
    int min = 0;if(p[num1]instanceof FreshFood)
    {
        FreshFood c = (FreshFood) p[num1];
        min = c.cost;
    }

    for(
    int i = num1 + 1;i<num2+num1;i++)
    {
        if (p[i] instanceof FreshFood) {
            FreshFood d = (FreshFood) p[i];
            if (d.cost < min) {
                min = d.cost;
                index = i;
            }
        }
    }

    if(p[index]instanceof FreshFood)
    {
        FreshFood e = (FreshFood) p[index];
        System.out.println("The item with the cheapest cost:");
        e.display();
    }
}}
