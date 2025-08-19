package lv.nixx.poc.monolith.audit;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class AuditEventListener {

    @EventListener
    public void handle(AuditEvent event) {
        System.out.println("Audit event: " + event);
    }

}
