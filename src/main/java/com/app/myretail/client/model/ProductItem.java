package com.app.myretail.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

public @Data class ProductItem {
    @JsonProperty("product_description")
    private ProductDescription productDescription;
}
