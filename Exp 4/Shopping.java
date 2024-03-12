import java.util.Scanner;

class Item {
    private String name;
    private double cost;

    public Item(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return name + ": $" + cost;
    }
}

class ShoppingCart {
    private Item[] items;
    private int itemCount;

    public ShoppingCart(int maxItems) {
        items = new Item[maxItems];
        itemCount = 0;
    }

    public void addItem(Item item) {
        items[itemCount] = item;
        itemCount++;
    }

    public double getTotalCost() {
        double totalCost = 0;
        for (int i = 0; i < itemCount; i++) {
            totalCost += items[i].getCost();
        }
        return totalCost;
    }

    public Item[] getItems() {
        return items;
    }
}

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ShoppingCart[][] carts = new ShoppingCart[2][3];

        for (int belt = 0; belt < 2; belt++) {
            for (int cartNum = 0; cartNum < 3; cartNum++) {
                System.out.println("Enter the number of perishable items for Cart " + (cartNum + 1) + " on belt " + (belt + 1) + ": ");
                int numPerishableItems = scanner.nextInt();
                System.out.println("Enter the number of non-perishable items for Cart " + (cartNum + 1) + " on belt " + (belt + 1) + ": ");
                int numNonPerishableItems = scanner.nextInt();

                ShoppingCart cart = new ShoppingCart(numPerishableItems + numNonPerishableItems);

                for (int i = 0; i < numPerishableItems; i++) {
                    System.out.println("Enter the name and cost of perishable item " + (i + 1) + " for Cart " + (cartNum + 1) + " on belt " + (belt + 1) + ": ");
                    String itemName = scanner.next();
                    double itemCost = scanner.nextDouble();
                    cart.addItem(new Item(itemName, itemCost));
                }

                for (int i = numPerishableItems; i < numPerishableItems + numNonPerishableItems; i++) {
                    System.out.println("Enter the name and cost of non-perishable item " + (i - numPerishableItems + 1) + " for Cart " + (cartNum + 1) + " on belt " + (belt + 1) + ": ");
                    String itemName = scanner.next();
                    double itemCost = scanner.nextDouble();
                    cart.addItem(new Item(itemName, itemCost));
                }

                carts[belt][cartNum] = cart;
            }
        }

        // Display results
        System.out.println("Total cost of each cart:");
        for (int belt = 0; belt < 2; belt++) {
            for (int cartNum = 0; cartNum < 3; cartNum++) {
                System.out.println("Cart " + (cartNum + 1) + " on belt " + (belt + 1) + ": $" + carts[belt][cartNum].getTotalCost());
            }
        }

        System.out.println("\nPerishable items sold:");
        for (int belt = 0; belt < 2; belt++) {
            for (int cartNum = 0; cartNum < 3; cartNum++) {
                System.out.println("Perishable items on Cart " + (cartNum + 1) + " on belt " + (belt + 1) + ": ");
                for (Item item : carts[belt][cartNum].getItems()) {
                    if (item != null) {
                        System.out.println(item);
                    }
                }
            }
        }

        scanner.close();
    }
}
