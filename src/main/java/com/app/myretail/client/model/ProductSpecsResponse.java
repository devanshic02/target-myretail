package com.app.myretail.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
public @Data class ProductSpecsResponse {
    @JsonProperty("product")
    private ProductSpecification productSpecification;
}
