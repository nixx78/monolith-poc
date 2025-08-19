package lv.nixx.poc.monolith.customers;

import lv.nixx.poc.monolith.audit.AuditEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerService {

    private final ApplicationEventPublisher events;

    public CustomerService(ApplicationEventPublisher events) {
        this.events = events;
    }

    public void updateCustomerAfterOrder(Long customerId) {

        System.out.println("Update client data, customerId: " + customerId);

        events.publishEvent(new AuditEvent(UUID.randomUUID().toString(), "Customer data updated"));
    }

}
