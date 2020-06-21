package com.app.myretail.client;


import com.app.myretail.client.model.ProductSpecsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

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

    public ProductSpecsResponse getProductSpecs(String productId) {
        return restTemplate.getForObject(
                getUrl(productId),
                ProductSpecsResponse.class
        );
    }

    private String getUrl(String productId) {
        return productSpecsUrlBase + productId + productSpecsUrlExtension;
    }
}
