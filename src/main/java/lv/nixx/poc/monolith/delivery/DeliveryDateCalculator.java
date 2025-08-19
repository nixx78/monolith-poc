package lv.nixx.poc.monolith.delivery;

import java.time.LocalDateTime;

public interface DeliveryDateCalculator {

    LocalDateTime calculateDeliveryDateTime(Long orderId);
}
