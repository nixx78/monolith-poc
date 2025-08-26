package lv.nixx.poc.monolith.customers;

import lv.nixx.poc.monolith.orders.OrderPlacedAuditEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class CustomerEventListener {

    private final CustomerService customerService;

    public CustomerEventListener(CustomerService customerService) {
        this.customerService = customerService;
    }

    @EventListener
    public void handle(OrderPlacedAuditEvent event) {
        customerService.updateCustomerAfterOrder(event.customerId());
    }
}
