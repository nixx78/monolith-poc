package lv.nixx.poc.monolith.orders;

import lv.nixx.poc.monolith.delivery.DeliveryDateCalculator;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class OrderService {

    private final ApplicationEventPublisher events;
    private final DeliveryDateCalculator deliveryDateCalculator;

    public OrderService(ApplicationEventPublisher events, DeliveryDateCalculator deliveryDateCalculator) {
        this.events = events;
        this.deliveryDateCalculator = deliveryDateCalculator;
    }

    public void placeOrder(Long orderId, Long customerId) {

        LocalDateTime deliveryDateTime = deliveryDateCalculator.calculateDeliveryDateTime(orderId);

        System.out.println("Order created: " + orderId + ": expected delivery date time: " + deliveryDateTime);

        events.publishEvent(new OrderPlacedEvent(orderId, customerId, deliveryDateTime));
    }
}
