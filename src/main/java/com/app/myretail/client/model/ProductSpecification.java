package com.app.myretail.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

public @Data class ProductSpecification {
    @JsonProperty("item")
    private ProductItem productItem;
}
