package lv.nixx.poc.event;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class EventUtilHelper {

    private final ApplicationEventPublisher eventPublisher;

    public EventUtilHelper(ApplicationEventPublisher eventPublisher) {
        this.eventPublisher = eventPublisher;
    }

    public void sendEvent(IdentifiableAuditEvent event) {
        eventPublisher.publishEvent(event);
    }

}
