package homework5;

public interface OrderDelivery {
    default void deliverOrder() {
        System.out.println("Order is being delivered through the pickup window.");
    }
    void deliverToHome();
}
