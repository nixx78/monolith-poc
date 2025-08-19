package lv.nixx.poc.monolith.delivery;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class DeliveryDateCalculatorImpl implements DeliveryDateCalculator {

    @Override
    public LocalDateTime calculateDeliveryDateTime(Long orderId) {
        return LocalDateTime.now().plusDays(1);
    }

}
