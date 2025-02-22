package homework5;

public class homework5 {
    public static void main(String[] args) {
        OrderReception onlineOrderReception = new OnlineOrderReception();
        OrderSaving orderSaving = new OrderSavingImpl();
        OrderCooking orderCooking = new OrderCookingImpl();
        OrderDelivery homeDelivery = new HomeDelivery();

        CustomerService customerService = new CustomerServiceImpl(onlineOrderReception, orderSaving, orderCooking, homeDelivery);
        customerService.processOrder();
    }
}
