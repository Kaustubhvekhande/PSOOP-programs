import java.util.*;

public class ConsumerTest {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
  
      System.out.print("Enter order number: ");
      int orderNumber = scanner.nextInt();
  
      System.out.print("Enter order price: ");
      double orderPrice = scanner.nextDouble();
  
      System.out.println("\nChoose dining option:");
      System.out.println("1. Eat Here");
      System.out.println("2. Take Away");
  
      System.out.print("Enter your choice (1/2): ");
      int choice = scanner.nextInt();
  
      Consumer consumer = new Consumer(orderNumber, orderPrice);
  
      switch (choice) {
        case 1:
          consumer.deliverOnTable(orderPrice);
          break;
        case 2:
          consumer.dispatchOrder(orderPrice);
          break;
        default:
          System.out.println("Invalid choice!");
      }
  
      scanner.close();
    }
  }
  