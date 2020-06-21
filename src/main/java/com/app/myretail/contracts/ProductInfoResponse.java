package com.app.myretail.contracts;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigInteger;

@JsonIgnoreProperties(ignoreUnknown = true)
@Accessors(fluent = true)
public @Data class ProductInfoResponse {
    @JsonProperty("id")
    private Long id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("current_price")
    private ProductPricing currentPrice;
}
