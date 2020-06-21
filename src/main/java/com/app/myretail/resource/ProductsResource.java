package com.app.myretail.resource;

import com.app.myretail.entity.ProductsEntity;
import com.app.myretail.repository.ddb.ProductPricingRepository;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Component
public class ProductsResource {
    final RestTemplate restTemplate;
    final ProductPricingRepository productsRepository;


    public ProductsResource(RestTemplate restTemplate, ProductPricingRepository productPricingRepository) {
        this.restTemplate = restTemplate;
        this.productsRepository = productPricingRepository;
    }

    public Optional<ProductsEntity> getProductInfo(String id) {
        return productsRepository.findProductsEntityByProductId(id);
    }


    public void updateProductInfo(ProductsEntity productsEntity) {
        productsRepository.save(productsEntity);
    }
}
