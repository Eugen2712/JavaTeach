package homework5;

public class HomeDelivery implements OrderDelivery {
    @Override
    public void deliverToHome() {
        System.out.println("Order is being delivered to the customer's home.");
    }
}
