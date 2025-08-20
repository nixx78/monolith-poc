package lv.nixx.poc.monolith.delivery.api;

import java.time.LocalDateTime;

public interface DeliveryDateCalculator {

    LocalDateTime calculateDeliveryDateTime(Long orderId);
}
