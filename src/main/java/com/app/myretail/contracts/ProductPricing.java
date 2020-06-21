package com.app.myretail.contracts;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.Accessors;

@Accessors(fluent = true)
public @Data class ProductPricing {
    @JsonProperty("value")
    private Float value;

    @JsonProperty("currency_code")
    private String currencyCode;
}
