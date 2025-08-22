package lv.nixx.poc.monolith.orders;

import lv.nixx.poc.eventutils.EventUtilHelper;
import lv.nixx.poc.monolith.delivery.api.DeliveryDateCalculator;
import lv.nixx.poc.monolith.delivery.api.ShippingCostCalculator;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Service
public class OrderService {

    private final DeliveryDateCalculator deliveryDateCalculator;
    private final ShippingCostCalculator shippingCostCalculator;
    private final EventUtilHelper eventUtilHelper;

    public OrderService(DeliveryDateCalculator deliveryDateCalculator, ShippingCostCalculator shippingCostCalculator, EventUtilHelper eventUtilHelper) {
        this.eventUtilHelper = eventUtilHelper;
        this.deliveryDateCalculator = deliveryDateCalculator;
        this.shippingCostCalculator = shippingCostCalculator;
    }

    public void placeOrder(Long orderId, Long customerId) {

        LocalDateTime deliveryDateTime = deliveryDateCalculator.calculateDeliveryDateTime(orderId);
        BigDecimal shippingCost = shippingCostCalculator.calculateShippingFee(BigDecimal.valueOf(10));

        System.out.println("Order created: " + orderId + ": expected delivery date time: " + deliveryDateTime + " : expected delivery cost: " + shippingCost);

        eventUtilHelper.sendEvent(new OrderPlacedEvent(orderId, customerId, deliveryDateTime, shippingCost));
    }

}
