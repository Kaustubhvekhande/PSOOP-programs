import java.util.*;

class Cart {
    double[][][] cart;
    double []cartCost;

    Cart(int n) {
        this.cart = new double[n][2][];
        cartCost = new double[n];
    }

    void setItems(int carts, int type, int items) {
        cart[carts][type] = new double[items];
    }

    void getTotalCost() {
        for (int i = 0; i < this.cart.length; i++) {
            double totalcost = 0;
            for (int j = 0; j < 2; j++) {
                
                for (int k = 0; k < cart[i][j].length; k++) {
                    totalcost += cart[i][j][k];
                }
            }
            cartCost[i]= totalcost;
            System.out.printf("The Total Cost of cart %d is %.2f", i+1, cartCost[i]);
        }
    }
}

public class TestCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p_item = 0, np_item = 0;
        System.out.print("Enter the number of carts: ");
        int cartno = sc.nextInt();
        Cart c = new Cart(cartno);

        for (int i = 0; i < cartno; i++) {
            System.out.println("Enter the number of perishable items in cart" + (i + 1) + ":");
            p_item = sc.nextInt();
            c.setItems(i, 0, p_item);
            System.out.println("Enter the number of non-perishable items in cart" + (i + 1) + ":");
            np_item = sc.nextInt();
            c.setItems(i, 1, np_item);
        }

    }
}