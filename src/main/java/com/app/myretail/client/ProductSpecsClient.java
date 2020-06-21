package com.app.myretail.client;


import com.app.myretail.client.model.ProductSpecsResponse;
import com.app.myretail.exception.ProductNotFoundException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Configuration
public class ProductSpecsClient {
    @Value("${product.specs.url.base}")
    String productSpecsUrlBase;

    @Value("${product.specs.url.extension}")
    String productSpecsUrlExtension;

    private final RestTemplate restTemplate;

    public ProductSpecsClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Optional<ProductSpecsResponse> getProductSpecs(String productId) {
        try {
            return Optional.ofNullable(restTemplate.getForObject(
                    getUrl(productId),
                    ProductSpecsResponse.class
            ));
        } catch (Exception e) {
            throw new ProductNotFoundException("Product Not Found - " + e.getMessage());
        }
    }

    private String getUrl(String productId) {
        return productSpecsUrlBase + productId + productSpecsUrlExtension;
    }
}