package lv.nixx.poc.monolith.orders;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record OrderPlacedEvent(Long orderId, Long customerId, LocalDateTime deliveryDateTime, BigDecimal shippingCost) {
}
