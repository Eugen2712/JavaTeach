package homework5;

public class PhoneOrderReception implements OrderReception {
    @Override
    public void receiveOrder() {
        System.out.println("Order received by phone.");
    }
}
