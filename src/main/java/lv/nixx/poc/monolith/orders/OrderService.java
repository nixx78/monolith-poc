package lv.nixx.poc.monolith.orders;

import lv.nixx.poc.monolith.delivery.api.DeliveryDateCalculator;
import lv.nixx.poc.monolith.delivery.api.ShippingCostCalculator;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Service
public class OrderService {

    private final ApplicationEventPublisher events;
    private final DeliveryDateCalculator deliveryDateCalculator;
    private final ShippingCostCalculator shippingCostCalculator;

    public OrderService(ApplicationEventPublisher events, DeliveryDateCalculator deliveryDateCalculator, ShippingCostCalculator shippingCostCalculator) {
        this.events = events;
        this.deliveryDateCalculator = deliveryDateCalculator;
        this.shippingCostCalculator = shippingCostCalculator;
    }

    public void placeOrder(Long orderId, Long customerId) {

        LocalDateTime deliveryDateTime = deliveryDateCalculator.calculateDeliveryDateTime(orderId);
        BigDecimal shippingCost = shippingCostCalculator.calculateShippingFee(BigDecimal.valueOf(10));

        System.out.println("Order created: " + orderId + ": expected delivery date time: " + deliveryDateTime + " : expected delivery cost: " + shippingCost);

        events.publishEvent(new OrderPlacedEvent(orderId, customerId, deliveryDateTime, shippingCost));
    }
}
