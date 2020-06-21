package com.app.myretail.contracts;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.Accessors;

@Accessors(chain = true)
public @Data class ProductInfoRequest {
    @JsonIgnore
    private Long productId;

    @JsonProperty("current_price")
    private ProductPricing currentPrice;
}
