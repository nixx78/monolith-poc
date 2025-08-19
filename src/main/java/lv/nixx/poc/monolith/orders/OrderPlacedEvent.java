package lv.nixx.poc.monolith.orders;

import java.time.LocalDateTime;

public record OrderPlacedEvent(Long orderId, Long customerId, LocalDateTime deliveryDateTime) {
}
