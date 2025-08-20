package lv.nixx.poc.monolith.delivery.api;

import java.math.BigDecimal;

public interface ShippingCostCalculator {

    BigDecimal calculateShippingFee(BigDecimal weight);
}
