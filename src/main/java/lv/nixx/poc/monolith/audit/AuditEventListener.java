package lv.nixx.poc.monolith.audit;

import lv.nixx.poc.event.IdentifiableAuditEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class AuditEventListener {


    /* If we uncomment this block, we receive exception - wrong module dependencies
    @Autowired
    public ShippingCostCalculator shippingCostCalculator;
     */

    @EventListener
    public void handle(IdentifiableAuditEvent event) {
        System.out.println("Audit event: " + event);
    }

}
