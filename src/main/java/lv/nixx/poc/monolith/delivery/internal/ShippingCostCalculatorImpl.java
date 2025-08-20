package lv.nixx.poc.monolith.delivery.internal;

import lv.nixx.poc.monolith.delivery.api.ShippingCostCalculator;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class ShippingCostCalculatorImpl implements ShippingCostCalculator {

    @Override
    public BigDecimal calculateShippingFee(BigDecimal weight) {
        return weight.multiply(BigDecimal.valueOf(1.3));
    }

}
