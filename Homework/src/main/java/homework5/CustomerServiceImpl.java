package homework5;

public class CustomerServiceImpl implements CustomerService {
    private OrderReception orderReception;
    private OrderSaving orderSaving;
    private OrderCooking orderCooking;
    private OrderDelivery orderDelivery;

    public CustomerServiceImpl(OrderReception orderReception, OrderSaving orderSaving, OrderCooking orderCooking, OrderDelivery orderDelivery) {
        this.orderReception = orderReception;
        this.orderSaving = orderSaving;
        this.orderCooking = orderCooking;
        this.orderDelivery = orderDelivery;
    }

    @Override
    public void processOrder() {
        orderReception.receiveOrder();
        orderSaving.saveOrder();
        orderCooking.cookOrder();
        orderDelivery.deliverOrder();
    }
}
