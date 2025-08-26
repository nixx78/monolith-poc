package lv.nixx.poc.monolith.orders;

import lv.nixx.poc.event.IdentifiableAuditEvent;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record OrderPlacedAuditEvent(String id,
                                    Long orderId,
                                    Long customerId,
                                    LocalDateTime deliveryDateTime,
                                    BigDecimal shippingCost) implements IdentifiableAuditEvent {
}
