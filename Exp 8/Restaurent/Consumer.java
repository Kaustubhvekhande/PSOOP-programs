interface EatItHere {
  void deliverOnTable(double orderPrice);
}

interface TakeAway {
  void dispatchOrder(double orderPrice);
}

public class Consumer implements EatItHere, TakeAway {
  private int orderNumber;
  private double orderPrice;

  public Consumer(int orderNumber, double orderPrice) {
    this.orderNumber = orderNumber;
    this.orderPrice = orderPrice;
  }

  @Override
  public void deliverOnTable(double orderPrice) {
    double serviceCharge = calculateServiceCharge(orderPrice, 0.1, 500.0);
    System.out.println("Order number: " + orderNumber + ", Service charge: Rs. " + serviceCharge);
    System.out.println("Total bill amount: Rs. " + (orderPrice + serviceCharge));
  }

  @Override
  public void dispatchOrder(double orderPrice) {
    double convenienceFee = calculateConvenienceFee(orderPrice);
    System.out.println("Order number: " + orderNumber + ", Convenience fee: Rs. " + convenienceFee);
    System.out.println("Total bill amount: Rs. " + (orderPrice + convenienceFee));
  }

  private double calculateServiceCharge(double orderPrice, double percentage, double fixedAmount) {
    double serviceChargePercentage = orderPrice * percentage;
    return Math.min(serviceChargePercentage, fixedAmount);
  }

  private double calculateConvenienceFee(double orderPrice) {
    double percentageFee = orderPrice * 0.05;
    return Math.max(percentageFee, 45.0);
  }
}
