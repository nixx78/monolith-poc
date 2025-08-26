package lv.nixx.poc.monolith.customers;

import lv.nixx.poc.event.EventUtilHelper;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerService {

    private final EventUtilHelper eventUtilHelper;

    public CustomerService(EventUtilHelper eventUtilHelper) {
        this.eventUtilHelper = eventUtilHelper;
    }

    public void updateCustomerAfterOrder(Long customerId) {
        System.out.println("Update client data, customerId: " + customerId);

        eventUtilHelper.sendEvent(new CustomerAuditEvent(UUID.randomUUID().toString(), "Customer data updated"));
    }

}
